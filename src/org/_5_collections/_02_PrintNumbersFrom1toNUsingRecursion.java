package org._5_collections;


import java.util.Scanner;

public class _02_PrintNumbersFrom1toNUsingRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        PrintRecursive(n);
    }

    private static void PrintRecursive(int n) {
        if (n < 1){
            return;
        }
        System.out.println(n);

        PrintRecursive(n - 1);

        System.out.println(n);
    }
}


