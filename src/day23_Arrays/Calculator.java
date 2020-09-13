package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers:");
            double num1 = in.nextDouble(), num2 = in.nextDouble();


            System.out.println("Enter the math operator:");
            char operator = in.next().charAt(0);

            double result = (operator == '+') ? num1 + num2 :
                            (operator == '-') ? num1 - num2 :
                            (operator == '*') ? num1 * num2 :
                            (operator == '/') ? num1 / num2 :
                            (operator == '%') ? num1 % num2 :
                            0;

            System.out.println("===========================");
            System.out.println("The result is: " + result);
            System.out.println("===========================");

            System.out.println();
            System.out.println("Do you want to continue?");
            String answer = in.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid Answer, please enter yes or no!");
                System.out.println("Do you want to continue?");
                answer = in.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }
        }
    }
}
