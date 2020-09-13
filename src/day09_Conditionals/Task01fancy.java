package day09_Conditionals;

import java.util.Scanner;

public class Task01fancy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("Please, type a Integer number:");

        int num = 0;
        while (true){
            try {
                num = Integer.valueOf(in.next());
                if (num < 0){
                    System.out.println(num + " is a negative number");
                    break;
                }
                if (num > 0){
                    System.out.println(num + " is a positive number");
                    break;
                }
                if (num == 0){
                    System.out.println(num + " is zero");
                    break;
                }

            }catch (Exception e){
                System.out.println("Please, type an Integer number!");
            }
        }
    }
}
