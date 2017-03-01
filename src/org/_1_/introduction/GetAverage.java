package org._1_.introduction;

//Create a method that finds the average of three numbers. Read in internet about java methods. Check the naming conventions.
//        Invoke your method and test it. Format the output to two digits after the decimal separator. The placeholder is %.2f

import java.util.Scanner;

public class GetAverage {


    private static void PrintAverage(float num1, float num2, float num3){
        float average = (num1 + num2 + num3) / 3;

        System.out.printf("%.2f", average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        PrintAverage(num1, num2, num3);
    }


}


