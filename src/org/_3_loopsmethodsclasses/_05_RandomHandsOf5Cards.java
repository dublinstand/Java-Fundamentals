package org._3_loopsmethodsclasses;

import java.util.Random;
import java.util.Scanner;

//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. Examples:

public class _05_RandomHandsOf5Cards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        char[] faces = { '♣', '♦', '♥', '♠' };

        Random random = new Random();

        for (int i = 0; i < count; i++){
            for (int j = 0; j < 5; j++){
                int randomCard = random.nextInt(12);
                int randomFace= random.nextInt(4);

                System.out.printf("%s%s", cards[randomCard], faces[randomFace]);
            }
            System.out.println();

        }

    }
}




