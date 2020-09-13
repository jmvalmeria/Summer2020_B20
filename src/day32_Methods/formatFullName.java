package day32_Methods;

import java.util.Arrays;

public class formatFullName {
    /*Warmup tasks:
    1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
    3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
*/

    public static void main(String[] args) {

        String first = "cYbErTeK";
        String last = "SCHOOL";

        System.out.println(formatFullName(first,last));

        double num1 = 10;
        char operator = '+';
        double num2 = 20;

        System.out.println(calculator(num1,operator,num2));

        int[] num = {1,2,3,4};
        int number = 7;

        System.out.println(Arrays.toString(addNumbertoArray(num,number)));

    }

    public static String formatFullName(String str1, String str2){
        String result = "";
        str1 = str1.substring(0,1).toUpperCase() + str1.substring(1,str1.length()-1).toLowerCase();
        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1,str1.length()-1).toLowerCase();
        result = str1 + " " + str2;
        return result;
    }

    public static double calculator(double num1, char operator, double num2){
        double result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '*') ? num1 * num2 : (operator == '/') ? num1 / num2 : (operator == '%') ? num1 % num2 : 0;
        return result;
    }

    public static int[] addNumbertoArray(int[] arr, int num){
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < result.length - 1; i++){
            result[i] = arr[i];
        }
        result[result.length-1] = num;

        return result;
    }
}
