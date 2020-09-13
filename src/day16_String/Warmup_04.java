package day16_String;

import java.util.Scanner;

public class Warmup_04 {
    public static void main(String[] args) {
        /*3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a word: ");
        String word = in.nextLine();
        String result = "";

        if (word.length() == 0){ //Empty character
            result = "string is empty";
        } else if (word.length() > 3){
            result = word.substring(word.length() - 3);
        } else {
            result = word.substring(0);
        }

        System.out.println(result);
    }
}
