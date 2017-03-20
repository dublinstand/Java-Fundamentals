package org._5_collections;

//Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the end of l1,
// but only when c does not appear in l1. Print the obtained combined list.
// All lists are given as sequence of letters separated by a single space, each at a separate line.
// Use ArrayList<Character> of chars to keep the input and output lists.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] charArray1 = scanner.nextLine().replace(" ","").toCharArray();
        char[] charArray2 = scanner.nextLine().replace(" ","").toCharArray();

        ArrayList<Character> letters1 = new ArrayList<>();
        ArrayList<Character> letters2 = new ArrayList<>();

        for (char l : charArray1){
            letters1.add(l);
        }

        for (char l : charArray2){
            letters2.add(l);
        }

        ArrayList<Character> finalLetters = new ArrayList<>(letters1);

        for (char l : letters2){
            if (!finalLetters.contains(l)){
                finalLetters.add(l);
            }
        }

        String listString = finalLetters.stream().map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.print(listString);
    }
}


