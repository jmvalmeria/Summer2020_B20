package day12_switch_Scanner;

import java.util.Scanner;

public class Odd_Even_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type a number: ");
        double num = in.nextDouble();

        String result = (num%2 == 0) ? num + " is Even number" : num + " is Odd number";

        System.out.println(result);
    }
}
