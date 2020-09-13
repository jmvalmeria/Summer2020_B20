package day16_String;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*6. write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If*/
        System.out.println("Please, type your first number: ");
        double num1 = in.nextDouble();

        System.out.println("Please, type your second number: ");
        double num2 = in.nextDouble();
        double result = 0;

        System.out.println("Please, type the symbol of your operator (+,-,*,/,%): ");
        char operator = in.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
            if(operator == '+'){
                result = num1 + num2;
            }else if (operator == '-'){
                result = num1 - num2;
            }else if (operator == '*'){
                result = num1 * num2;
            }else if(operator == '/'){
                result = num1 / num2;
            }else{
                result = num1 % num2;
            }

        }else{
            System.out.println("Invalid operator!");
        }

        System.out.println("===================================");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println("===================================");
    }
}
