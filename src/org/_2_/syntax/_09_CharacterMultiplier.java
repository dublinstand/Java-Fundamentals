package org._2_.syntax;

import java.util.Scanner;

//Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1.charAt (0)
//        with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
//        If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.

public class _09_CharacterMultiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();
        int totalSum = 0;

        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                totalSum += first.charAt(i) * second.charAt(i);
            }
        } else {
            int minSize = Math.min(first.length(), second.length());
            for (int i = 0; i < minSize; i++) {
                totalSum += first.charAt(i) * second.charAt(i);
            }

            if (first.length() > second.length()) {
                for (int i = 0; i < first.length() - minSize; i++) {
                    totalSum += first.charAt(i);
                }
            } else {
                for (int i = 0; i < second.length() - minSize; i++) {
                    totalSum += second.charAt(i);
                }
            }
        }

        System.out.print(totalSum);


    }
}
