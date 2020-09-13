package day17_StringMethods;

import java.util.Scanner;

public class WarmUp06 {
    public static void main(String[] args) {
        /*6. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your email address: ");
        String email = in.nextLine();

        int atSymbol = email.indexOf("@");
        int dotSymbol = email.lastIndexOf(".");

        System.out.println("===================================================");
        System.out.println("the domain of the email is: " + email.substring(atSymbol + 1, dotSymbol));
        System.out.println("===================================================");
    }
}
