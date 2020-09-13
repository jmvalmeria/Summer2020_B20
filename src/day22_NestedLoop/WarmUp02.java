package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp02 {
    public static void main(String[] args) {
        /*2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your sentence:");
        String sentence = in.nextLine();

        System.out.println("Please, type a letter:");
        char ch = in.next().charAt(0);

        int count = 0;

        for (int i = 0; i <= sentence.length() - 1; i++){

            char each = sentence.charAt(i);

            if (each == ch){
                count += 1;
            }

        }

        System.out.println("" + ch + " are " + count + " in the sentence");


    }
}
