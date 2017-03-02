package org._2_.syntax;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program that takes as input an array of strings are prints only the words that start and end with capital letter.
//        Words are only strings that consist of English alphabet letters. Use regex.


public class _08_StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        Pattern regex = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b|\\b[A-Z]\\b");
        Matcher match = regex.matcher(word);

        while (match.find()) {
            System.out.print(match.group(0) + " ");
        }
    }
}
