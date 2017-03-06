package org._2_syntax;

import java.util.ArrayList;
import java.util.Scanner;

//Write a method that returns the first N odd/even elements from a collection. Return as many as you can.

public class _10_GetFirstOddOrEvenElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        String[] scannedNums = scanner.nextLine().split(" ");

        for (String item : scannedNums) {
            nums.add(Integer.parseInt(item));
        }

        String[] commands = scanner.nextLine().split(" ");
        int count = Integer.parseInt(commands[1]);
        String command = commands[2];

        ArrayList<Integer> returnedNums = new ArrayList<>();

        if (command.equals("odd")) {
            for (Integer num : nums) {
                if (num % 2 != 0) {
                    returnedNums.add(num);
                }
            }
        } else if (command.equals("even")) {
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    returnedNums.add(num);
                }
            }
        }

        if (returnedNums.size() <= count) {
            for (Integer num : returnedNums) {
                System.out.print(num + " ");
            }
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(returnedNums.get(i) + " ");
            }
        }
    }
}
