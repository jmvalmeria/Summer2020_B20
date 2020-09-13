package day24_Arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        /*2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers*/
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?: ");
        int numArr = in.nextInt();

        int[] numberStore = new int[numArr];
        int indexNumber = 1;

        for (int i = 0; i < numArr; i++){
            System.out.println("Please, enter #" + indexNumber + ":");
            indexNumber++;
            int num = in.nextInt();
            numberStore [i] = num;
        }

        int max = numberStore[0];
        int min = numberStore[0];

        for (int i = 0; i < numArr; i++){
            if (numberStore[i] > max){
                max = numberStore[i];
            }

            if (numberStore[i] < min){
                min = numberStore[i];
            }
        }

        System.out.println("This is the maximum number: " +  max);
        System.out.println("This is the minimum number: " + min);

    }
}
