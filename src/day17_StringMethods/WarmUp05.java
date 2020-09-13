package day17_StringMethods;

import java.util.Scanner;

public class WarmUp05 {
    public static void main(String[] args) {
        /*5. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a sentence: ");
        String setence = in.nextLine();

        //Using a loop
        System.out.println("===================================================");
        for (int i = setence.length() - 1; i > -1; i-- ){
            System.out.print(setence.substring(i,i+1));
        }
        System.out.println("\n===================================================");

    }
}
