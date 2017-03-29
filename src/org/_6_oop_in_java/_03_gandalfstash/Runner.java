package org._6_oop_in_java._03_gandalfstash;

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


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moodPoints = scanner.nextInt();

        //you need to scan next line
        scanner.nextLine();

        String[] input = scanner.nextLine().toLowerCase().replace("_"," ").split("\\W+");

        Gandalf gandalf = new Gandalf(moodPoints);

        for(String food : input){
            gandalf.gandalfEats(food);
        }

        System.out.println(gandalf.getMoodPoints());
        System.out.println(gandalf.getMood());
    }



}
