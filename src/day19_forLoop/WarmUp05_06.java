package day19_forLoop;

public class WarmUp05_06 {
    public static void main(String[] args) {
        /* 5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
            6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        */

        int result = 0;
        int result1 = 0;

        for (int i = 2; i <= 100; i += 2){
            result = result += i;
        }

        System.out.println(result);

        System.out.println("============================================");

        for (int i = 1; i <= 100; i += 2){
            result1 = result1 += i;
        }

        System.out.println(result1);
    }
}
