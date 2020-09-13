package day12_switch_Scanner;

import java.util.Scanner;

public class Month_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = " ";

        System.out.println("Please, type a number of the days of the week: ");
        int numDay = in.nextInt();

        switch (numDay){
            case 1:
                result = "January";
                break;

            case 2:
                result = "Frebruary";
                break;

            case 3:
                result = "March";
                break;

            case 4:
                result = "April";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "Jun";
                break;

            case 7:
                result = "July";
                break;

            case 8:
                result = "Agust";
                break;

            case 9:
                result = "September";
                break;

            case 10:
                result = "October";
                break;

            case 11:
                result = "November";
                break;

            case 12:
                result = "December";
                break;

            default:
                result = "Invalid";
        }

        System.out.println("====================");
        System.out.println(result);
        System.out.println("====================");
    }
}
