package day11_IfStatements;

import java.util.Scanner;

public class task01_Triangles {
    public static void main(String[] args) {
    /*1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.*/
        Scanner in = new Scanner(System.in);
        int angle1 = 0, angle2 = 0, angle3 = 0;
        String error = "Please, type a integer number!";

        //1st Angle
        System.out.println();
        System.out.println("Please, type your 1st angle: ");
        while (true){
            try {
                angle1 = Integer.valueOf(in.nextLine());
                System.out.println();
                System.out.println("Your 1st angle is: " +  angle1);
                break;
            }catch (Exception e){
                System.out.println(error);
            }
        }

        //2nd Angle
        System.out.println();
        System.out.println("Please, type your 2nd angle: ");
        while (true){
            try {
                angle2 = Integer.valueOf(in.nextLine());
                System.out.println();
                System.out.println("Your 2nd angle is: " +  angle2);
                break;
            }catch (Exception e){
                System.out.println(error);
            }
        }

        //3rd Angle
        System.out.println();
        System.out.println("Please, type your 3rd angle: ");
        while (true){
            try {
                angle3 = Integer.valueOf(in.nextLine());
                System.out.println();
                System.out.println("Your 2nd angle is: " +  angle3);
                break;
            }catch (Exception e){
                System.out.println(error);
            }
        }

        //Result
        boolean isATriangle = (angle1 + angle2 + angle3) == 180;
        if (isATriangle){
            System.out.println();
            System.out.println("===================================================");
            System.out.println("It is a triangle with the angles: " + angle1 + ", " + angle2 + ", " + angle3);
            System.out.println("===================================================");
        } else {
            System.out.println();
            System.out.println("===================================================");
            System.out.println("It is NOT a triangle with the angles: " + angle1 + ", " + angle2 + ", " + angle3);
            System.out.println("===================================================");
        }
    }
}
