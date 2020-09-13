package day25_PracticeArrays;

import java.util.Arrays;

public class twoArrys_in_One_Max {
    public static void main(String[] args) {
        /* 6. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
*/
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] arr3 = new int[arr1.length + arr2.length];

        //This is the easy way to combine two arrays
        int index = 0; //Assigned an Index that is incrementing every iteration, at the end of the first loop index = 3
        for (int each : arr1){
            arr3[index] = each;
            index++;
        }

        for (int each : arr2){ //Index is applay in here with value 3 to add the next value
            arr3[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr3));

        //This is the quick way to find de Maximum and Minimum
        Arrays.sort(arr3);
        System.out.println("The maximum number is: " + arr3[arr3.length - 1]);
        System.out.println("The minimun number is: " + arr3[0]);

    }
}
