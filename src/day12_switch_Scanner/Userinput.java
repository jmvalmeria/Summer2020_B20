package day12_switch_Scanner;

import java.util.Scanner; //1st import

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // We have create the object

        System.out.println("Please, type a number:");
        int num1 = input.nextInt();

        System.out.println("Your entered: " + num1);
    }
}
