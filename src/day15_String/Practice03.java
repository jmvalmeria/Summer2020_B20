package day15_String;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your first word: ");
        String word1 = in.nextLine();

        System.out.println("Please, type your second word: ");
        String word2 = in.nextLine();

        String newWord = word1.concat(word2);
        System.out.println(newWord);
    }
}
