package day13_next_methods;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int buildingNumber = in.nextInt();

        in.nextLine(); //Reset the Scanner
        System.out.println("Enter your street name: ");
        String streetName = in.nextLine();

        System.out.println(buildingNumber + " " + streetName);

        in.close();
    }
}
