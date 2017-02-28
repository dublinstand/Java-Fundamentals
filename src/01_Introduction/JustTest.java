package Introduction;


import java.util.Scanner;

public class JustTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter row numbers: ");
        Integer numberOfLines = scan.nextInt();
        triangleOfAlphabets(numberOfLines);
    }

    private static void triangleOfAlphabets(int numberOfLines){
        topRows(numberOfLines);
        lowRows(numberOfLines);
    }

    private static void topRows(int numberOfLines){
        for(int i = 0; i <= numberOfLines; i++){
            printLineOfAlphabet(i);
        }
    }

    private static void lowRows(int numberOfLines){
        for(int i = numberOfLines -1; i > 0; i--){
            printLineOfAlphabet(i);
        }
    }

    private static void printLineOfAlphabet(int i){
        for (char c = 'a'; c < 'a' + i; c++ ){
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
