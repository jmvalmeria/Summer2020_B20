package day20_WhileLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type the number for factorial: ");
        int factorial = in.nextInt();

        int result = 1;

        for (int i = factorial; i >= 1; i-- ){
            result *= i;
        }

        System.out.println("Your factorial number is: " + result);
    }
}
