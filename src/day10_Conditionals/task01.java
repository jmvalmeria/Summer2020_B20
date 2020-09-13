package day10_Conditionals;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your 1st number:");
        int num1 = 0;
        while (true){
            try{
                num1 = Integer.valueOf(in.nextLine());
                System.out.println("Your 1st number is: " + num1);
                break;
            }catch (Exception e){
                System.out.println("Please, type a Integer number!");
            }
        }

        System.out.println();
        System.out.println("Please, type your 2nd number:");
        int num2 = 0;
        while (true){
            try{
                num2 = Integer.valueOf(in.nextLine());
                System.out.println("Your 2nd number is: " + num2);
                break;
            }catch (Exception e){
                System.out.println("Please, type a Integer number!");
            }
        }

        System.out.println();
        System.out.println("Please, type your 3rd number:");
        int num3 = 0;
        while (true){
            try{
                num3 = Integer.valueOf(in.nextLine());
                System.out.println("Your 3rd number is: " + num3);
                break;
            }catch (Exception e){
                System.out.println("Please, type a Integer number!");
            }
        }

        if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println();
            System.out.println("Your 1st number: " + num1 + " is bigger than your 2nd number: " + num2 + " and your 2nd number is bigger than your 3rd number: " + num3);
        }
        if (num1 > num2 && num1 > num3 && num3 > num2){
            System.out.println();
            System.out.println("Your 1st number: " + num1 + " is bigger than your 3rd number: " + num3 + " and your 3rd number is bigger than your 2nd number: " + num2);
        }
        if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println();
            System.out.println("Your 2nd number: " + num2 + " is bigger than your 1st number: " + num1 + " and your 1st number is bigger than your 3rd number: " + num3);
        }
        if (num2 > num1 && num2 > num3 && num3 > num1){
            System.out.println();
            System.out.println("Your 2nd number: " + num2 + " is bigger than your 3rd number: " + num3 + " and your 3rd number is bigger than your 1st number: " + num1);
        }
        if (num3 > num1 && num3 > num2 && num1 > num2){
            System.out.println();
            System.out.println("Your 3rd number: " + num3 + " is bigger than your 1st number: " + num1 + " and your 1st number is bigger than your 2nd number: " + num2);
        }
        if (num3 > num1 && num3 > num2 && num2 > num1){
            System.out.println();
            System.out.println("Your 3rd number: " + num3 + " is bigger than your 2nd number: " + num2 + " and your 2nd number is bigger than your 1st number: " + num1);
        }
        if (num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println();
            System.out.println("Your 3 numbers: " + "1st: " + num1 + " 2nd: " + num2 + " 3rd: " + num3 + "are equal");
        }
        if (num1 == num2 && num1 > num3){
            System.out.println();
            System.out.println("Your 1st number: " + num1 + " and 2nd number: " + num2 + " are equal and your 3rd number: " +  num3 + " is the smaller");
        }
        if (num1 == num2 && num3 > num1){
            System.out.println();
            System.out.println("Your 3rd number: " + num3 + " is bigger than your 1st number: " + num1 + " and your 2nd number: " +  num2);
        }
        if (num1 == num3 && num1 > num2){
            System.out.println();
            System.out.println("Your 1st number: " + num1 + " and 3rd number: " + num3 + " are equal and your 2nd number: " +  num2 + " is the smaller");
        }
        if (num1 == num3 && num2 > num1){
            System.out.println();
            System.out.println("Your 2nd number: " + num2 + " is bigger than your 1st number: " + num1 + " and your 3rd number: " +  num3);
        }
    }
}
