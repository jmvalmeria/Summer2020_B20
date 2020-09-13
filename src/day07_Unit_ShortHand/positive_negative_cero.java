package day07_Unit_ShortHand;

import java.util.Scanner;

public class positive_negative_cero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type a integer number: ");

        int num = 0;
        while (true) {
            try {
               num = Integer.valueOf(in.nextLine());
               boolean result1 = num > 0;
               boolean result2 = num < 0;
               boolean result3 = num == 0;

               System.out.println("Number " + num + " is positive number? " + result1);
               System.out.println("Number " + num + " is negative number? " + result2);
               System.out.println("Number " + num + " is zero? " + result3);
               break;
                } catch (Exception e){
                    System.out.println("Please, type an integer number!");
                }
            }

    }
}
