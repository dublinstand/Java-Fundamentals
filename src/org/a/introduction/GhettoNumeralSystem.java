package org.a.introduction;


import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Please enter digit to be turned to Ghetto: ");
        String input = console.nextLine();
        String ghetto = "";
        GhettoNames(input, ghetto);
    }

    private static String GhettoNames(String input, String ghetto) {
        for (int i = 0; i <= input.length(); i++) {
            switch (input.charAt(i)) {
                case '0':
                    ghetto += "Gee";
                    break;
                case '1':
                    ghetto += "Bro";
                    break;
                case '2':
                    ghetto += "Zuz";
                    break;
                case '3':
                    ghetto += "Ma";
                    break;
                case '4':
                    ghetto += "Duh";
                    break;
                case '5':
                    ghetto += "Yo";
                    break;
                case '6':
                    ghetto += "Dis";
                    break;
                case '7':
                    ghetto += "Hood";
                    break;
                case '8':
                    ghetto += "Jam";
                    break;
                case '9':
                    ghetto += "Mack";
                    break;
            }
        }
        System.out.print(ghetto);
        return ghetto;


    }

}
