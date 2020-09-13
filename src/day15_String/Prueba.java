package day15_String;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int wordLength = word.length();
        String result = " ";

        if (wordLength % 2 != 0){
            if (wordLength == 1){
                result = "" + word.charAt(0) + word.charAt(0) + word.charAt(0);
            } else{
                int misteryLetter = wordLength / 2 + 1;
                result = word.substring(misteryLetter -1 ,misteryLetter);
            }

        }else{
            if (wordLength == 2){
                result = "" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1);
            }else{
                int misteryLetter1 = wordLength / 2;
                result = word.substring(misteryLetter1 -1 ,misteryLetter1 + 1);
            }

        }

        System.out.println(result);

    }
}
