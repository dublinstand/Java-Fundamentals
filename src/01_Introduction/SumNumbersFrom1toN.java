package Introduction;


import java.util.Scanner;

public class SumNumbersFrom1toN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you need to process: ");
        Integer totalNumber = scan.nextInt();
        Integer sum = calculateSum(totalNumber);
        System.out.print(sum);

}
    private static Integer calculateSum(int totalNumber) {
        int sum = 0;
        for (int i = 0; i <= totalNumber; i++) {
            sum = sum + i;   // or sum += i
        }
        return sum;
    }
}