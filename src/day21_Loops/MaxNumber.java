package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = -2147483648;

        for (int i = 1; i <= 5; i += 10){
            System.out.println("Enter a number");
            int num = in.nextInt();

            if (num > max){
                max = num;
            }
        }

    }
}
