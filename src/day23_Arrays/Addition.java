package day23_Arrays;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Enter two numbers:");
            int num1 = in.nextInt(), num2 = in.nextInt(), sum = num1 + num2;

            System.out.println("===========================");
            System.out.println("The result is: " + sum);

            System.out.println();
            System.out.println("Do you want to continue?");
            String answer = in.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Answer, please enter yes or no!");
                System.out.println("Do you want to continue?");
                answer = in.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }

    }
}
