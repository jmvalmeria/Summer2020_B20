package day20_WhileLoops;

import java.util.Scanner;

public class Until_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop*/
        int result = 0;


        for (int i = 0; i == 0;){
            System.out.println("Please, type a number:");
            int num = in.nextInt();

            if (num < 0){
              break;
            }

            result += num;
        }

        System.out.println("The sum is: " + result);

    }
}
