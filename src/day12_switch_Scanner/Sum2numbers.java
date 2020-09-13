package day12_switch_Scanner;

import java.util.Scanner;

public class Sum2numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your first number: ");
        int num1 = in.nextInt();

        System.out.println("Please, now type your second number: ");
        int num2 = in.nextInt();

        int result = num1 + num2;

        System.out.println("The addiction of " + num1 + " and " + num2 + " is: " + "\"" + result + "\"");
    }
}
