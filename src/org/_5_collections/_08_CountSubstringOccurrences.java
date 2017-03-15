package org._5_collections;

//Write a program to find how many times given string appears in given text as substring.
// The text is given at the first input line. The search string is given at the second input line.
// The output is an integer number. Please ignore the character casing.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String token = scanner.nextLine();
        String word = scanner.next();

//        String[] words = token.split("[//W+]]");

        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(token);

        int count = 0;
        int start = 0;
        while (matcher.find(start)) {
            count++;
            start = matcher.start() + 1;
        }
        System.out.println(count);
    }
}


