package org._2_syntax;

import java.util.Scanner;

//Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
//        ((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
//        Then calculate the difference between the average of the three numbers and the average of the two formulae.
//        Average (a, b, c) – Average (f1, f2)

public class _03_CalculateExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double firstFormulaResult = FirstFormula(a, b, c);
        double secondFormulaResult = SecondFormula(a, b, c);
        double averageThreeNumbers = AverageBetweenThreeNumbers(a, b, c);
        double averageTwoNumbers = AverageBetweenTwoNumbwers(firstFormulaResult, secondFormulaResult);
        double difference = Math.abs(averageThreeNumbers - averageTwoNumbers);

        System.out.printf("F1 result: %.2f; F2 result %.2f; Diff: %.2f", firstFormulaResult, secondFormulaResult, difference);

    }

    private static double AverageBetweenTwoNumbwers(double a, double b) {
        return (a + b) / 2;
    }

    private static double AverageBetweenThreeNumbers(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    private static double SecondFormula(double a, double b, double c) {
        double f1 = (a * a + b * b - c * c * c);
        double f2 = a - b;
        return Math.pow(f1, f2);
    }

    private static double FirstFormula(double a, double b, double c) {

        double f1 = (a * a + b * b) / (a * a - b * b);
        double f2 = ((a + b + c) / Math.sqrt(c));

        return Math.pow(f1, f2);

    }
}
