package day17_StringMethods;

import java.util.Scanner;

public class WarmUp03 {
    public static void main(String[] args) {
        /*3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your first word:");
        String word1 = in.next();

        System.out.println("Please, type your second word:");
        String word2 = in.next();

        String result = (word1.charAt(word1.length()-1) == word2.charAt(0)) ? word1 + word2.substring(1) : word1 + word2;
        System.out.println(result);

    }
}
