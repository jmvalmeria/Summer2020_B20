package day14_Review;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars
*/

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your car brand: ");
        String brand = in.nextLine();

        System.out.println();
        System.out.println("Please, type your car model: ");
        String model = in.nextLine();

        System.out.println();
        System.out.println("Please, type now the year: ");
        int year = in.nextInt();

        System.out.println();
        System.out.println("Please, type the color: ");
        String color = in.next();

        System.out.println();
        System.out.println("Please, type the mileage: ");
        int mileage = in.nextInt();

        System.out.println();
        System.out.println("Please, type the price: ");
        double price = in.nextDouble();

        System.out.println();
        System.out.println("******************************************");
        System.out.println(year + " " + brand + " " + model + " " + color + ", " + mileage + " miles, $" + price);
        System.out.println("******************************************");

    }
}
