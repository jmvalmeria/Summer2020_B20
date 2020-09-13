package day20_WhileLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String password = "Cybertek123";

        System.out.println("Please, type your password:");
        String input = in.nextLine();
        int chances = 3;

        while ( !input.equals(password) ){
            System.out.println("Please, re-type your password!");
            input = in.nextLine();
        }

        System.out.println("Logged in!");

    }
}
