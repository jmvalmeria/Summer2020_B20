package day17_StringMethods;

import java.util.Scanner;

public class WarmUp01 {
    public static void main(String[] args) {
        /*1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a word:");
        String word = in.next();
        String result = "";

        if (word.startsWith("x")){
            result = word.substring(1);
        } else {
            result = word;
        }

        System.out.println(result);
    }
}
