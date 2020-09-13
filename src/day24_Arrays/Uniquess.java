package day24_Arrays;

import java.util.Scanner;

public class Uniquess {
    public static void main(String[] args) {
        /*1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a sentence:");
        String str = in.nextLine();
        String nonRepit = "";
        String unique = "";


        for (int i = 0; i < str.length(); i++){
            String ch = "" + str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){ //In the sentence it check the indeof the character and it checks if it is equal with the lastindeof
                unique += ch;
            }


            if (!nonRepit.contains(ch)){
                nonRepit += ch;
            }
        }

        System.out.println("This the characters in the sentence: " + nonRepit);
        System.out.println("This the Uniques characters: " + unique);
    }
}
