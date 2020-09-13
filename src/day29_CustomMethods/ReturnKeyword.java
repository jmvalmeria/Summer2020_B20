package day29_CustomMethods;

import java.util.Scanner;

public class ReturnKeyword {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Please, type a grade:");
            grade(in.nextInt());
        }

    }

    public static void grade(int score){
        if (score < 0 || score > 100){
            System.out.println("Invalid score!");
            System.out.println();
            return;
        }

        char result = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
        System.out.println("Grade is: " + result);
        System.out.println();
    }
}
