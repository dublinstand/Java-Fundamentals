package org._3_loopsmethodsclasses;

//Write a method to convert from degrees to radians.
//        Write a method to convert from radians to degrees. You are given a number n and n queries for conversion.
//        Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad".
//        Convert all radians to degrees and all degrees to radians. Print the results as n lines,
//        each holding a number + space + measure. Format all numbers with 6 digit after the decimal point.

import java.util.Scanner;

public class _04_AngleUniteConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++){
//            String[] token = scanner.nextLine().split(" ");   - this fails, because you need to enter the line at each prompt, cant
//            just paste all data
//            CalculateAndPrintConversion(token[0], token[1]);

            double amount = scanner.nextDouble();
            String type = scanner.next();
            CalculateAndPrintConversion(amount, type);
        }
    }

    private static void CalculateAndPrintConversion(double amount, String type) {
//        int numAmount = Integer.parseInt(amount);
        double convertedAmount = 0;


        if (type.equals("deg")){
            convertedAmount = amount * Math.PI / 180;
            type = "rad";
        }
        else if(type.equals("rad")){
            convertedAmount = amount * 180 / Math.PI;
            type = "deg";
        }

        System.out.printf("%.6f %s", convertedAmount, type);
        System.out.println();
    }
}




