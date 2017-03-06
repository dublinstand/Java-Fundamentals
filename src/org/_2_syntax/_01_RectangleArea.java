package org._2_syntax;

//Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area.

import java.util.Scanner;

public class _01_RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        CountAndPrintRectangle(a, b);

    }

    private static void CountAndPrintRectangle(int a, int b) {
        int area = a * b;
        System.out.print(area);
    }
}


