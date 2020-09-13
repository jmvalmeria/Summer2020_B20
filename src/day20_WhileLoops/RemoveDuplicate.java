package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a sentence:");
        String sentence = in.nextLine();
        String result = "";

        for (int i = 0; i <= sentence.length() - 1; i++ ){
            String s = "" + sentence.charAt(i);
            if (!result.contains(s)){
                result += s;
            }
        }

        System.out.println(result);

    }
}
