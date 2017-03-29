package org._6_oop_in_java;


//Gandalf the Gray is a great wizard but he also loves to eat. When he is hungry he gets angry. These are some of Gandalf's favorite types of food:
//        •	Cram: 2 points of happiness;
//        •	Lembas: 3 points of happiness;
//        •	Apple: 1 point of happiness;
//        •	Melon: 1 point of happiness;
//        •	HoneyCake: 5 points of happiness;
//        •	Mushrooms: -10 points of happiness;
//        •	Everything else: -1 point of happiness;
//        Gandalf moods are:
//        •	Angry - below -5 points of happiness;
//        •	Sad - from -5 to 0 points of happiness;
//        •	Happy - from 0 to 15 points of happiness;
//        •	Special JavaScript mood - when happiness points are more than 15;
//        Input
//        The input comes from the console. It will holds two lines: first - Gandalf`s first mood.
//        On the second line will be described the foods that Gandalf will eat, separated with different symbols or whitespace(s).  Comparing the input is case-insensitive. The input data will always be valid and in the format described. There is no need to check it explicitly.
//        Output
//        Print on the console Gandalf`s happiness points and mood after he drinks his beers.


import java.util.Scanner;

public class _01_GandalfStash {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialHappiness = Integer.parseInt(scan.nextLine());

        String[] objects = scan.nextLine().toLowerCase().split("[^a-zA-Z]+");

        for (String object : objects) {
            switch (object) {
                case "cram":
                    initialHappiness += 2;
                    break;
                case "lembas":
                    initialHappiness += 3;
                    break;
                case "apple":
                    initialHappiness += 1;
                    break;
                case "melon":
                    initialHappiness += 1;
                    break;
                case "honeycake":
                    initialHappiness += 5;
                    break;
                case "mushrooms":
                    initialHappiness -= 10;
                    break;
                default:
                    initialHappiness -= 1;
                    break;
            }
        }
        System.out.println(initialHappiness);
        if (initialHappiness < -5) {
            System.out.println("Angry");
        } else if (initialHappiness >= -5 && initialHappiness < 0) {
            System.out.println("Sad");
        } else if (initialHappiness >= 0 && initialHappiness < 15) {
            System.out.println("Happy");
        } else if (initialHappiness >= 15) {
            System.out.println("Special JavaScript mood");
        }
    }
}

