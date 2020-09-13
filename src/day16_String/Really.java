package day16_String;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a word: ");
        String word = in.next();

        String result = (word.endsWith("ly")) ? "really???" : "never mind!";

        System.out.println(result);
    }
}
