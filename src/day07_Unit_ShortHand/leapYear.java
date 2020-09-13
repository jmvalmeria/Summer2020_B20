package day07_Unit_ShortHand;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        /*1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, type the year that you want to check if it is Leap Year or not:");
        int year = 0;

        while (true) {
            try {
                year = Integer.valueOf(scanner.nextLine());
                boolean result = year % 4 == 0;
                if (year <= 0) {
                    System.out.println("Please, type a real Year");
                    continue;
                } else {
                    if (result == true) {
                        System.out.println("Year " + year + " is a leap year");
                    } else {
                        System.out.println("Year " + year + " is not a leap year");
                    }
                    break;
                }
            } catch (Exception e){
                System.out.println("Please, type a year number, no letters or decimal numbers!");
            }
        }
    }
}
