package org._5_collections;

//Write a program to enter a number n and n integer numbers and sort and print them.
// Keep the numbers in array of integers: int[].

import java.util.Arrays;
import java.util.Scanner;

public class _04_SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print(Arrays.toString(numbers));
    }
}


