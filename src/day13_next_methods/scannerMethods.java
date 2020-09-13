package day13_next_methods;

import java.util.Scanner;

public class scannerMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //next(); CAN ONLY contend a word, since first character to the space
        System.out.println("Enter your company name:");
        String companyName = in.next();

        System.out.println("Your company name is: " + companyName);

    }
}
