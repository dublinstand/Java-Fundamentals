package org._5_collections;

//Write a program to extract all email addresses from given text.
// The text comes at the first input line. Print the emails in the output, each at a separate line.
// Emails are considered to be in format <user>@<host>

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _09_ExtractEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String token = scanner.nextLine();

        //[A-Za-z0-9._]+ - must have one of those characters
        //followed by @
        //A-Za-z0-9]+ - must have one of those characters
        //\.[a-z]{2,3} - start with a point (escaped with \) then have 2 or three of [a-z]
        String emailPattern = "[A-Za-z0-9._]+@[A-Za-z0-9]+\\.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(token);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}


