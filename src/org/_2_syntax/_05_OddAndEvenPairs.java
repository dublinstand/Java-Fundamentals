package org._2_syntax;

import java.util.ArrayList;
import java.util.Scanner;

//You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive
//        pairs and prints if both are odd/even or not. Note that the array length should also be an even number

public class _05_OddAndEvenPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");

        for(int i = 0; i < input.length; i++ ){
            numbers.add(Integer.parseInt(input[i]));
        }


        if (numbers.size() % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }

        for (int i = 0; i < numbers.size(); i += 2) {
            int firstNum = numbers.get(i);
            int secondNum = numbers.get(i + 1);

            if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                System.out.printf("%d, %d -> both are even\n", firstNum, secondNum);
            } else if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                System.out.printf("%d, %d -> both are odd\n", firstNum, secondNum);
            } else {
                System.out.printf("%d, %d -> different\n", firstNum, secondNum);
            }
        }
    }
}
