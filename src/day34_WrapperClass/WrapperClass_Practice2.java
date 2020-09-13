package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE; //Maximum number you can assigne to an Integer
        System.out.println(a);

        byte b = Byte.MAX_VALUE; //Maximum value you can assigne to a Byte
        System.out.println(b);

        System.out.println("===================================");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }
        }

        System.out.println(max);
    }

}
