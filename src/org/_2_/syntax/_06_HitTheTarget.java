package org._2_.syntax;

import java.util.Scanner;

//Write a program that takes as input an integer – the target – and outputs
//        to the console all pairs of numbers between 1 and 20, which, if added or subtracted, result in the target.

public class _06_HitTheTarget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.printf("%d + %d = %d\n", i, j, target);
                }
            }
        }

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == target) {
                    System.out.printf("%d - %d = %d\n", i, j, target);
                }
            }
        }
    }
}
