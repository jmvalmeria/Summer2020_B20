package day14_Review;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*2. write a program that asks the user enter the:
                    1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary */

        Scanner in = new Scanner(System.in);

        System.out.println("Please, type the company name: ");
        String company = in.nextLine();

        System.out.println();
        System.out.println("Please, type now your first name: ");
        String name = in.next();
        in.nextLine();

        System.out.println();
        System.out.println("Please, type now your last name: ");
        String lastName = in.nextLine();

        System.out.println();
        System.out.println("Please, type now your job Title: ");
        String jobTitle = in.nextLine();

        System.out.println();
        System.out.println("Please, type now your salary: ");
        double salary = 0;
        while (true){
            try{
                salary = Integer.valueOf(in.nextLine());
                if (salary <= 0){
                    System.out.println("Please, type a real salary! ");
                    continue;
                } else {
                    break;
                }

            }catch (Exception e){
                System.out.println("Please, type a number!");
            }

        }

        System.out.println();
        System.out.println(company);
        System.out.println("=================================");
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("=================================");
    }
}
