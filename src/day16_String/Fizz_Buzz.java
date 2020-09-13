package day16_String;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type your first word: ");
        String word1 = in.next();

        System.out.println("Please, type now your second word: ");
        String word2 = in.next();

        String result = "";

        if (word1.length() == 5 && word2.length() == 5){
            if(word1.charAt(word1.length() - 1) == word2.charAt(0)){
                result = "Fizz";
            }else {
                result = "Buzz - did not match";
            }

        }else {
            result = "Need to be exactly 5 chars length";
        }

        System.out.println(result);

    }
}
