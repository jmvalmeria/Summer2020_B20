package day16_String;

import java.util.Scanner;

public class Warmup_03 {
    public static void main(String[] args) {
        /*3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your word: ");
        String word = in.next();

        boolean result = word.charAt(0) == word.charAt(word.length() - 1);

        System.out.println(result);



    }
}
