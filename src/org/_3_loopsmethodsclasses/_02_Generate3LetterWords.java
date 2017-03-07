package org._3_loopsmethodsclasses;

import java.util.Scanner;

//Write a program to generate and print all 3-letter words consisting of given set of characters.
//        For example if we have the characters 'a' and 'b', all possible words will be
//        "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at the first
//        line of the input.
//        Input characters are unique (there are no repeating characters).

public class _02_Generate3LetterWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int x = 0; x < length; x++) {
                    System.out.print("" + input.charAt(i) + input.charAt(j) + input.charAt(x) + " ");
                }
            }
        }
    }
}




