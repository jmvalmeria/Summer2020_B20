package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "ABCDE";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("================================");

        String sentence = "I Love Programming Language";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }

        System.out.println();
        System.out.println("================================");

        String s = "JAVA";
        String[] arr = s.split(""); //String
        char[] c = s.toCharArray(); //Char


        for (int i = s.length()-1; i >= 0; i--){
            System.out.print(arr[i]);
        }

        System.out.println();

        for (int i = s.length()-1; i >= 0; i--){
            System.out.print(c[i]);
        }
    }
}
