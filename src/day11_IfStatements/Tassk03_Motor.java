package day11_IfStatements;

import java.util.Scanner;

public class Tassk03_Motor {
    public static void main(String[] args) {
        /*3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false*/

        Scanner in = new Scanner(System.in);
        int years = 0;
        String error = "Please, type a year!";
        String isEligible = "Is your vehicle eligible? ";

        System.out.println("**************************************");
        System.out.println("*SDET Motors Inc.                    *");
        System.out.println("**************************************");
        System.out.println("Please, type the year of your vehicle: ");

        while (true){
            try {
                years = Integer.valueOf(in.nextLine());
                System.out.println();
                System.out.println("The year of your vehicle is: " + years);
                break;
            }catch (Exception e){
                System.out.println(error);
            }
        }

        boolean isRecall = (years >= 1995 && years < 1998) || (years >= 2001 && years <= 2002) || (years >= 2004 && years <=2006) || (years >= 2015 && years <=2017);
        if (isRecall){
            System.out.println(isEligible + isRecall);
        }else {
            System.out.println(isEligible + isRecall);
        }
    }
}
