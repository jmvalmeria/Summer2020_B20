package day24_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        /*3. Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10*/

        Scanner in = new Scanner(System.in);
        System.out.println("Please, type how many numbers you want to introduce:");
        int arrSize = in.nextInt();

        int[] arr = new int[arrSize];
        int count = 1;

        for (int i = 0; i < arr.length; i++){
            System.out.println("Please, type number #" + count);
            count++;
            arr[i] = in.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double average = sum / (double) arr.length;

        System.out.println("The average is: " + average);
    }
}
