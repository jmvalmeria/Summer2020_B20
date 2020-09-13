package day16_String;

import java.util.Scanner;

public class Warmup_01 {
    public static void main(String[] args) {
        /*1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
*/
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type your first word: ");
        String word1 = in.next();

        System.out.println("Please, type now your second word: ");
        String word2 = in.next();

        System.out.println("========================================");
        System.out.println("Your new word is: " + word1.substring(1) + word2.substring(1));
    }
}
