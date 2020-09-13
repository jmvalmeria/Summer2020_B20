package day19_forLoop;

import java.util.Scanner;

public class WarmUp07 {
    public static void main(String[] args) {
        /*7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type the number that you desire to add all the numbers:");
        int num = in.nextInt();
        int result = 0;

        for (int i = 1; i <= num; i++){
            result = result += i;
        }

        System.out.println("=========================================================");
        System.out.println("The addiction of all numbers from 1 to " + num + " is: " + result);
        System.out.println("=========================================================");
    }
}
