package org._5_collections;

//Write a program that enters an array of strings and finds in it all sequences of equal elements.
// The input strings are given as a single line, separated by a space.

import java.util.Scanner;

public class _03_SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] token = scanner.nextLine().split(" ");

        System.out.print(token[0]);
        for (int i = 1; i < token.length; i++) {

            if (token[i].equals(token[i - 1])){
                System.out.print(" " + token[i]);
            }
            else {
                System.out.println();
                System.out.print(token[i]);
            }


        }
    }
}


