package org._2_syntax;

//Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of the triangle
//        composed by these 3 points. Round the result to a whole number. In case the three points do not form a triangle,
//        print "0" as result.

import java.util.Scanner;

public class _02_TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
        Point a = new Point(scanner.nextInt(), scanner.nextInt());
        Point b = new Point(scanner.nextInt(), scanner.nextInt());
        Point c = new Point(scanner.nextInt(), scanner.nextInt());

        CalculateAndPrintAreaOfTriangle(a, b, c);

    }

    private static void CalculateAndPrintAreaOfTriangle(Point a, Point b, Point c) {
        double area = Math.abs(((a.X*(b.Y - c.Y) + b.X*(c.Y - a.Y) +c.X*(a.Y - b.Y))/2 ));
        System.out.print((int)area);
    }

    private static class Point{
        private int X;
        private int Y;

        Point(int x, int y) {
            X = x;
            Y = y;
        }

    }
}


