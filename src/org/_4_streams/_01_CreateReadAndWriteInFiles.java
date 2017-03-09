package org._4_streams;

//Create a program that reads a log about users that spent time playing some game.
// The format is {user hh:mm hh:mm ... hh:mm}. Calculate the total time spent for each user and write
// it to another file total-played.txt


import java.io.*;

public class _01_CreateReadAndWriteInFiles {

    public static void main(String[] args) {
        String fileInputPath = "resources/CreateAndWriteInFiles/users.txt";
        String fileOutputPath = "resources/CreateAndWriteInFiles/outputUsers.txt";


        File fileInput = new File(fileInputPath);
        File fileOutput = new File(fileOutputPath);


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput));
             FileWriter fileWriter = new FileWriter(fileOutput, true);
             PrintWriter printWriter = new PrintWriter(fileWriter, true)) {

            String nextLine = null;

            while ((nextLine = bufferedReader.readLine()) != null) {
                String[] lineArgs = nextLine.split(" ");
                String userName = lineArgs[0];
                int totalMinutes = 0;

                for (int i = 1; i < lineArgs.length; i++){
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalMinutes += hours * 60 + minutes;
                }

                printWriter.println("Name: " + userName + " has played in total: " + totalMinutes + " minutes");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


