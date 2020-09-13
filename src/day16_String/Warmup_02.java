package day16_String;

import java.util.Scanner;

public class Warmup_02 {
    public static void main(String[] args) {
        /*2. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your word: ");
        String word = in.next();

        String result = (word.length() % 2 != 0) ? "" + word.charAt(word.length() / 2) : "" + word.charAt(word.length() / 2 - 1) + word.charAt(word.length() / 2);

        System.out.println(result);

    }
}
