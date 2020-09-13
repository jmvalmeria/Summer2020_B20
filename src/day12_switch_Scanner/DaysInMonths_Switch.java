package day12_switch_Scanner;

import java.util.Scanner;

public class DaysInMonths_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String result = " ";

        System.out.println("Please, type the number of the month:");
        int month = in.nextInt();

        switch (month){
            case 2:
                result = "28 days";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

            default:
                result = "Invalid";
        }

        System.out.println(result);
    }
}
