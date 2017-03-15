package org._5_collections;

//Write a program to count the number of words in given sentence.
// Use any non-letter character as word separator.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class _06_CountAllWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split(" ");

//        int[] numbers = Arrays.stream(token)
//                .mapToInt(Integer::parseInt)
//                .toArray();

        List<Integer> numbers = Arrays.stream(token)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer>currentSequence = new ArrayList<>();
        currentSequence.add(numbers.get(0));

        List<Integer>largestSequence = new ArrayList<>(currentSequence);

        for (int i = 1; i < numbers.size(); i++){

            if (numbers.get(i) > numbers.get(i - 1)){
                currentSequence.add(numbers.get(i));
            }
            else {
                System.out.println(currentSequence);

                if (largestSequence.size() < currentSequence.size()){
                    //if you have a list equals another list that will be changed, put it in the brackets,
                    //otherwise the largestSequence list will be changed every time when currentSeqeunce is updated
                    largestSequence = new ArrayList<>(currentSequence);
                }

                currentSequence.clear();
                currentSequence.add(numbers.get(i));
            }
        }

        if (largestSequence.size() < currentSequence.size()){
            largestSequence = new ArrayList<>(currentSequence);
        }

        //using joining , for a list and convert it to string
        String listString = largestSequence.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(currentSequence);
        System.out.println("Longest: " + listString);
    }
}


