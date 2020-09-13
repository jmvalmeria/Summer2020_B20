package day19_forLoop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        /*2. palindrome
        level ==> level ==> true
        mom ==> mom  ==> true
        muhtar ==> rathum ==> false*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your word: ");
        String word = in.nextLine();
        String word1 = word;
        word1 = word.replaceAll("[,. ]", "");
        String reverseWord = "";

        for (int i = word1.length() - 1; i >= 0; i--){
            reverseWord += word1.charAt(i);
        }

        if (word1.equalsIgnoreCase(reverseWord)){
            System.out.println("===================================");
            System.out.println("Is \"" +  word + "\" a palindrome? " + "true");
        } else {
            System.out.println("===================================");
            System.out.println("Is \"" +  word + "\" a palindrome? " + "false");
        }

    }
}
