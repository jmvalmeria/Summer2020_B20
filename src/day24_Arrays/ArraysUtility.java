package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr); //It is going to give an error
        System.out.println(Arrays.toString(arr)); //This is the way to print it

        System.out.println("=======================================");

        int[] nums = {5,4,5,6,1,3,10};
        Arrays.sort(nums); //It sort in order smaller to bigger 0 < 100 or a < z
        System.out.println(Arrays.toString(nums));

        System.out.println("The maximum number is: " + nums[nums.length-1]);
        System.out.println("The minimum number is: " + nums[0]);

        String[] chessPieces = {"Peon", "Torre", "Arfil", "Dama", "Caballo", "Rey"};
        Arrays.sort(chessPieces);

        System.out.println(Arrays.toString(chessPieces));

        System.out.println("=======================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        int[] arr3 = {2,1,3};

        System.out.println(Arrays.equals(arr1,arr3));

        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.equals(arr2,arr3));

    }
}
