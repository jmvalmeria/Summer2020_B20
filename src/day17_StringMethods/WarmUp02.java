package day17_StringMethods;

import java.util.Scanner;

public class WarmUp02 {
    public static void main(String[] args) {
        /*2. Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a word: ");
        String word = in.next();

        String result = (word.startsWith("xx")) ? word.substring(2) : (word.startsWith("x")) ? word.substring(1) : word;
        System.out.println(result);

    }
}
