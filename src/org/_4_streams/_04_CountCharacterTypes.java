package org._4_streams;

//Write a program that reads a list of words from the file words.txt and finds the count of vowels (гласни букви),
// consonants (съгласни) and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels
// and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
//Write the results in file count-chars.txt.

import java.io.*;

public class _04_CountCharacterTypes {

    public static void main(String[] args) {
        String fileInputPath = "resources/CountCharacterTypes/Input.txt";
        String fileOutputPath = "resources/CountCharacterTypes/Output.txt";
        String vowelsSymbols = "aeiou";
        String punctuationSymbols = "!.,?";

        File inputFile = new File(fileInputPath);
        File outputFile = new File(fileOutputPath);

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileWriter fw = new FileWriter(outputFile);) {

            int nextLine;
            int vowels = 0;
            int consonants = 0;
            int punctuations = 0;


            while ((nextLine = fis.read()) != -1) {
                char ch = (char) nextLine;
                if (vowelsSymbols.contains(ch + "")) {
                    vowels++;
                } else if (punctuationSymbols.contains(ch + "")) {
                    punctuations++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }


//            while ((nextLine = bufferedReader.readLine())!= null){
//                for (char a : nextLine.toCharArray()){
//                    if (a == 'a' || a =='e' || a =='i' || a =='o' || a =='u'){
//                        vowels++;
//                    }
//                    else if (a == '!' || a ==',' || a =='.' || a =='?' ){
//                        punctuations++;
//                    }
//                    else if (a != ' '){
//                        consonants++;
//                    }
//                }
//            }

            fw.write(String.format("Vowels: %d%n",vowels));
            fw.write(String.format("Consonants: %d%n",consonants));
            fw.write(String.format("Punctuation: %d%n",punctuations));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


