package day08_LogicalOperators;

public class conditionals01 {
    public static void main(String[] args) {
        /* Write a program that can identidy the largest number between two numbers */
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2){
            System.out.println(num1 + " in the larger number");
        } else if (num1 < num2){
            System.out.println(num2 + " in the larger number");
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
