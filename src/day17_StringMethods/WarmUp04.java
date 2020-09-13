package day17_StringMethods;

import java.util.Scanner;

public class WarmUp04 {
    public static void main(String[] args) {
        /*4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your name: ");
        String name = in.next();

        System.out.println("Please, type your last name:");
        String lastName = in.next();

        System.out.println("* * * *");
        System.out.println("* " + name.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase() + " *");
        System.out.println("* * * *");
    }
}
