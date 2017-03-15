package org._5_collections;

//Write a program to find how many times a word appears in given text. The text is given at the first input line.
// The target word is given at the second input line. The output is an integer number.
// Please ignore the character casing. Consider that any non-letter character is a word separator.

import java.util.Scanner;

public class _07_CountSpecifiedWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String token = scanner.nextLine();
        String word = scanner.next();
        int count = 0;

        //Using regular expressions for removing non letters [\\W+]
        String[] words = token.replace("[\\W+]", "").split(" ");

        for (String w : words){
            if (word.equals(w.toLowerCase())){
                count++;
            }
        }

        System.out.println(count);
    }
}


