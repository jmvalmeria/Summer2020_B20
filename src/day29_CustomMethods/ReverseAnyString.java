package day29_CustomMethods;

import java.util.Scanner;

public class ReverseAnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please, the message you want to reverse: ");
            reverse(in.nextLine());
        }
    }

    public static void reverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
        System.out.println();
    }
}
