package org._5_collections;

//At the first line at the console you are given a piece of text.
// Extract all words from it and print them in alphabetical order.
// Consider each non-letter character as word separator. Take the repeating words only once.
// Ignore the character casing. Print the result words in a single line, separated by spaces.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11_ExtractAllUniqueWords {

    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split("\\W+");

        // Main Logic
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        // Output
        for (String uniqueWordString : uniqueWords) {
            System.out.print(uniqueWordString + " ");
        }
    }
}


