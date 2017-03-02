package org._2_.syntax;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program that extracts words from a string. Words are sequences of characters that
//        are at least two symbols long and consist only of English alphabet letters. Use regex.


public class _07_ExtractWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

//        word = word.replaceAll("[^a-zA-z]", " ");
//        System.out.print(word);

        Pattern regex = Pattern.compile("[a-zA-Z]+");
        Matcher match = regex.matcher(word);

        //it is printing each match found according the pattern in string word, prints the whole group plus space
        while (match.find()){
            System.out.print(match.group(0) + " ");
        }

    }
}
