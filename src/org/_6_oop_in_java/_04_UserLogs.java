package org._6_oop_in_java;

//You are given an input in the format:
//        IP=(IP.Address) message=(A&sample&message) user=(username)
//        Your task is to parse the ip and the username from the input and for every user, you have to display every ip from which the corresponding user has sent a message and the count of the messages sent with the corresponding ip. In the output, the usernames must be sorted alphabetically while their IP addresses should be displayed in the order of their first appearance. The output should be in the following format:
//        username:
//        IP => count, IP => count.
//        For example, given the following input - IP=192.23.30.40 message='Hello&derps.' user=destroyer, you have to get the username destroyer and the IP 192.23.30.40 and display it in the following format:
//        destroyer:
//        192.23.30.40 => 1.
//        The username destroyer has sent a message from ip 192.23.30.40 once.


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_UserLogs {

    public static void main(String[] args) {
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] input = command.split(" ");
            String[] ipElements = input[0].split("=");
            String ip = ipElements[1];

            String[] userElements = input[2].split("=");
            String userName = userElements[1];
            
            InsertData(data, ip, userName);

            command = scanner.nextLine();
        }
        
        PrintData(data);

    }
    private static void InsertData(TreeMap<String, LinkedHashMap<String, Integer>> data, String ip, String userName) {

        if (!data.containsKey(userName)){
            data.put(userName, new LinkedHashMap<String, Integer>());
            data.get(userName).put(ip, 1);
        }
        else {
            int count = 0;
            if (data.get(userName).containsKey(ip)){
                count = data.get(userName).get(ip);
            }

            data.get(userName).put(ip, count + 1);
        }
    }


    private static void PrintData(TreeMap<String, LinkedHashMap<String, Integer>> data) {

        for(Map.Entry<String, LinkedHashMap<String, Integer>> firstEntry : data.entrySet()){
            String user = firstEntry.getKey();
            LinkedHashMap<String, Integer> hashMap = firstEntry.getValue();

            System.out.println(user + ":");

            for (Map.Entry<String, Integer> secondEntry : hashMap.entrySet()){
                String ip = secondEntry.getKey();
                Integer count = secondEntry.getValue();

                System.out.print(ip + " => " + count);

                String lastKey = getLastKey(hashMap);

                if(!ip.equals(lastKey)){
                    System.out.print(",");
                }
                else{
                    System.out.print(".");
                }

                System.out.println();
            }
        }
    }

    private static String getLastKey(LinkedHashMap<String, Integer> hashMap) {
        String out = "";
        for (String key : hashMap.keySet()) {
            out = key;
        }
        return out;
    }
}
