package day24_Arrays;

import java.util.Arrays;

public class Convine2ArrayAndPrintMax {
    public static void main(String[] args) {
        /*2. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8*/

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = new int[arr1.length-1 + arr2.length-1];

        for (int i = 0; i < arr3.length; i++){
            if (i <= arr3.length/2){
                arr3[i] += arr1[i];
            } else {
                arr3[i] += arr2[i-i--];
            }
        }

        Arrays.toString(arr3);
        System.out.println(arr3);

    }

}
