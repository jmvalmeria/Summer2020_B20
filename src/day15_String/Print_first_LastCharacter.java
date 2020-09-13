package day15_String;

import java.util.Scanner;

public class Print_first_LastCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a sentence: ");
        String sentence = in.nextLine();

        char firstCharacter = sentence.charAt(0);
        int lastCharacterCalculation = sentence.length() - 1;
        char lastCharacter = sentence.charAt(lastCharacterCalculation);

        System.out.println("Your First Character is: " + firstCharacter + " and your last Character is: " + lastCharacter);
    }
}
