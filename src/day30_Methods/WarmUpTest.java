package day30_Methods;

/*
wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

 */

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTest {
    public static void main(String[] args) {
        maxNum(21,15);

        int[] arr = {5,2,3,4,5,6,4,7,0,-5,-25,-55};
        printDesc(arr);

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        combine2Arrays(arr1,arr2);

        PostNegaZero(arr);
    }


    //Task01:
    public static void maxNum(int num1, int num2){
        String result = (num1 >= num2) ? num1 + " is maximum" : num2 + " is maximum";
        System.out.println(result);
    }

    //Task02
    public static void printDesc(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }


    //Task03

    public static void combine2Arrays(int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length + arr2.length];

            int index = 0;
            for (int each : arr1) {
                arr3[index] = each;
                index++;
            }

            for (int each : arr2) {
                arr3[index] = each;
                index++;
            }

        System.out.println(Arrays.toString(arr3));
    }

    //Task04
    public static void PostNegaZero(int[] arr1){
        for (int each : arr1){
            String result = (each < 0) ? each + " is negative" : (each > 0) ? each + " is positive" : each + " is positive";
            System.out.print(result + " ");
        }
    }

}


