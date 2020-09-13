package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp01 {
    public static void main(String[] args) {
        /*1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a word:");
        String word = in.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length() - 1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean ending = ch2 >= 'a' && ch2 <= 'z';

        System.out.println(start && ending);

    }
}
