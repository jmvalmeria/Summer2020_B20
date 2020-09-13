package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String  answer = in.next();

        String result = (answer.equalsIgnoreCase("yes")) ? "Employeed" : "Not employeed";

        System.out.println(result);
    }
}
