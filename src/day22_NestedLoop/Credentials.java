package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        username: cyber
        password: tek123
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Please, type your name:");
        String u = in.next();

        System.out.println("Please, type your password");
        String p = in.next();

        int attempt = 0;

        while (!(u.equals("cyber") && p.equals("tek123"))){
            System.out.println("Invalid user name or password. Please re-enter");
            attempt++;

            System.out.println("\n=====================================");

            System.out.println("Please, type your name:");
            u = in.next();

            System.out.println("Please, type your password");
            p = in.next();

            if (attempt == 3){
                System.out.println("Your account is lock!");
                System.exit(0);
            }
        }

        System.out.println("You logged in!");

    }
}
