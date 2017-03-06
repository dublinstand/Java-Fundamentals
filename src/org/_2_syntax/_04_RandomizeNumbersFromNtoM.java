package org._2_syntax;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Write a program that takes as input two integers N and M,
//        and randomizes the numbers between them. Note that M may be smaller than or equal to N.

public class _04_RandomizeNumbersFromNtoM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int numMin = Math.min(num1, num2);
        int numMax = Math.max(num1, num2);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = numMin; i <= numMax; i ++){
            list.add(i);
        }

        list = RandomizeNumbers(list);

        System.out.println(String.join(", ", list.toString()));
    }

    private static  ArrayList<Integer> RandomizeNumbers(ArrayList<Integer> list) {
        Random rand = new Random();

        for(int i = 0; i < list.size(); i ++){
            int firstNum = list.get(i);
            list.remove(i);
            list.add(rand.nextInt(list.size()-1), firstNum);
        }
        return  list;
    }

}
