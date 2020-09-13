package day13_next_methods;

import java.util.Scanner;

public class scanner_nextPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your name: ");
        String name = in.next(); //If for some reason somebody type 2  words, it is going to feel the next variable but
        in.next(); //With this in the code is going to take what is left in the Scanner, allowed you to fill the next camp

        System.out.println("Please, now type your last name: ");
        String lastName = in.next();

        System.out.println("Your name is: " + name + " " + lastName);
    }
}
