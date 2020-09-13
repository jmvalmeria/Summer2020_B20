package day15_String;

import java.util.Scanner;

public class FullName_UpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your name: ");
        String name = in.next();

        in.nextLine();
        System.out.println("Please,type your last name: ");
        String lastName = in.nextLine();

        System.out.println(name.toUpperCase() + " " + lastName.toUpperCase());
    }
}
