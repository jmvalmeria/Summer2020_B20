package day23_Arrays;

import java.util.Scanner;

public class DaysWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] DaysWeek = new String[7];
        DaysWeek[6] = "Sunday";
        DaysWeek[1] = "Tuesday";
        DaysWeek[0] = "Monday";
        DaysWeek[4] = "Friday";
        DaysWeek[3] = "Thursday";
        DaysWeek[5] = "Saturday";
        DaysWeek[2] = "Wednesday";

        for (int i = 0; i < DaysWeek.length-1; i++){
            System.out.print(DaysWeek[i] + " ");
        }

        System.out.println();

        System.out.println("=========================");

        System.out.println("Enter a number between 1 ~ 7:");
        int num = in.nextInt();

        System.out.println(DaysWeek[num-1]);

    }
}
