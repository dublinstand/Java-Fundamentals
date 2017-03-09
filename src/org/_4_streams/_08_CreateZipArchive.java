package org._4_streams;

//Write a program that reads three txt files words.txt, count-chars.txt and lines.txt and create a zip archive named
// text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _08_CreateZipArchive {

    public static void main(String[] args) {
        String zipFile = "resources/CreateZipArchive/text-files.zip";
        String[] inputFiles = {"resources/CreateZipArchive/count-chars.txt",
                "resources/CreateZipArchive/lines.txt",
                "resources/CreateZipArchive/words.txt"};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];

            for (String inputFile : inputFiles) {
                File file = new File(inputFile);

                FileInputStream fileInputStream = new FileInputStream(file);
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));

                int length;
                while ((length = fileInputStream.read(buffer)) != -1) {
                    zipOutputStream.write(buffer, 0, length);
                }

                zipOutputStream.closeEntry();
                fileInputStream.close();
            }

            zipOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




