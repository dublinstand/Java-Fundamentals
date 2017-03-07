package org._3_loopsmethodsclasses;


//Write a program to read a text file "Input.txt" holding a sequence of integer numbers,
// each at a separate line. Print the sum of the numbers at the console.
// Ensure you close correctly the file in case of exception or in case of normal execution.
// In case of exception (e.g. the file is missing), print "Error" as a result.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _07_SumNumbersFromTextFile {

    public static void main(String[] args) {
        String testFile = "src/org/_3_loopsmethodsclasses/SumNumbersFromTextFileInput.txt";
        List<Integer> numbers = new ArrayList<Integer>();

        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(testFile));
        ) {
            while (true){
                String line = fileReader.readLine();

                if(line == null){
                    break;
                }

                int num = Integer.parseInt(line);

                numbers.add(num);
            }

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        //having the sum of a list in a stream
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.print(sum);
    }
}




