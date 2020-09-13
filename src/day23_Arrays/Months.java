package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type a number 1 ~ 12:");
        int num = in.nextInt();

        System.out.println(months[num-1]);


    }
}
