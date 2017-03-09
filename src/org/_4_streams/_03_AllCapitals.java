package org._4_streams;

//Write a program that reads a text file and changes the casing of all letters to upper.
// The file should be overwritten. Use BufferedReader, FileReader, FileWriter, and PrintWriter.


import java.io.*;

public class _03_AllCapitals {

    public static void main(String[] args) {
        String fileInputPath = "resources/AllCapitals/Input.txt";
        String fileOutputPath = "resources/AllCapitals/Output.txt";

        File inputFile = new File(fileInputPath);
        File outputFile = new File(fileOutputPath);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             FileWriter fileWriter = new FileWriter(outputFile, true);
             PrintWriter printWriter = new PrintWriter(fileWriter);) {

            String nextLine = null;

            while ((nextLine = bufferedReader.readLine())!= null){
                printWriter.println(nextLine.toUpperCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


