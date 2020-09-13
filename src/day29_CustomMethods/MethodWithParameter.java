package day29_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printHello(5);
        System.out.println("===============================================");
        System.out.println("Please, type the year of your birth-day and current year:");
        age(in.nextInt(),in.nextInt());
    }


    public static void printHello(int n){ //This is the way to pass de parameter, argument is the data between ()
        for (int i = 1; i <= n; i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthday , int currentYear){
        if (currentYear < birthday){
            System.out.println("Invalid Entry");
        } else {
            int age = currentYear - birthday;
            System.out.println("You are " + age + " years old");
        }
    }
}
