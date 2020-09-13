package day12_switch_Scanner;

import java.util.Scanner;

public class DaysOftheWeek_Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = " ";

        System.out.println("Please, type a number of the days of the week: ");
        int numDay = in.nextInt();

        switch (numDay){
            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";
        }

        System.out.println("====================");
        System.out.println(result);
        System.out.println("====================");
    }

}
