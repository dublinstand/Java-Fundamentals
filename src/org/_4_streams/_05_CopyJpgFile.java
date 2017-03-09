package org._4_streams;

//Write a program that copies the contents of a .jpg file to another using FileInputStream,
// FileOutputStream, and byte[] buffer. Set the name of the new file as my-copied-picture.jpg.

import java.io.*;

public class _05_CopyJpgFile {

    public static void main(String[] args) {
        String fileInputPath = "resources/CopyJpgFile/Bulgarian-Banner.jpg";
        String fileOutputPath = "resources/CopyJpgFile/my-copied-Bulgarian-banner.jpg";

        File inputFile = new File(fileInputPath);
        File outputFile = new File(fileOutputPath);

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile);) {

            int i;
            while ((i = fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


