package org._3_loopsmethodsclasses;

import java.util.Scanner;

//Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999).
//        A number is symmetric if its digits are symmetric toward its middle.
//        For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.

public class _01_SymmetricNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstNum = Integer.parseInt(input[0]);
        int secondNum = Integer.parseInt(input[1]);

        for (int i = firstNum; i <= secondNum; i++) {
            if (i <= 9) {
                System.out.print(i + " ");
            } else if (i >= 10 && i <= 99) {
                String numString = "" + i;

                if (numString.charAt(0) == numString.charAt(1)) {
                    System.out.print(i + " ");
                }
            } else if (i >= 100 && i <= 999) {
                String numString = "" + i;

                if (numString.charAt(0) == numString.charAt(2)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


