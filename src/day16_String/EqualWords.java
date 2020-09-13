package day16_String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your first word: ");
        String word1 = in.next();

        System.out.println("Please, type your second word: ");
        String word2 = in.next();

        String result = (word1.equals(word2)) ? "They are equal!" : "They are not equal";

        System.out.println(result);
    }
}
