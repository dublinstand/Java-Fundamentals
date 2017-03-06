package org._1_introduction;

//Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt ().
//        Test your program with integers up to 26. Think why.

import java.util.Scanner;

public class PrintCharacterTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many rows you want to print: ");
        Integer numberOfLines = input.nextInt();
        triangleOfAlphabets(numberOfLines);

    }

    private static void triangleOfAlphabets(Integer numberOfLines) {
        upperRows(numberOfLines);
        lowerRows(numberOfLines);
    }

    private static void upperRows(Integer numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printLineOfAlphabets(i);
        }
    }

    private static void lowerRows(Integer numberOfLines) {
        for (int i = numberOfLines - 1; i > 0; i--) {
            printLineOfAlphabets(i);
        }

    }

    private static void printLineOfAlphabets(int i) {
        for (char c = 'a'; c < 'a' + i; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}


