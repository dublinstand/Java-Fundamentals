package org._3_loopsmethodsclasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Write a program to calculate the difference between two dates in number of days.
// The dates are entered at two consecutive lines in format day-month-year.
// Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100].

public class _06_DaysBetweenTwoDates {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String firstDateAsString = scanner.nextLine();
        String secondDateAsString = scanner.nextLine();

        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date firstDate = format.parse(firstDateAsString);
        Date secondDate = format.parse(secondDateAsString);

        long difference = secondDate.getTime() - firstDate.getTime();

        System.out.print( TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS));
    }
}




