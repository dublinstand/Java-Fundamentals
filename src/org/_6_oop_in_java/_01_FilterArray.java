package org._6_oop_in_java;

//Create a program that reads a log about users that spent time playing some game.
// The format is {user hh:mm hh:mm ... hh:mm}. Calculate the total time spent for each user and write
// it to another file total-played.txt


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_FilterArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(input)
                .filter(_01_FilterArray::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //3 ways to sum a list of integers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        int sumAnotherWay = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();

        System.out.println(sum);
        System.out.println(sumAnotherWay);
        System.out.println(sumReduce);

    }

    private static boolean isNumber(String str) {
        for (char a : str.toCharArray()) {
            if (!Character.isDigit(a)) {
                return false;
            }
        }
        return true;
    }
}


