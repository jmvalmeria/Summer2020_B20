package day13_next_methods;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*5. write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner*/

        Scanner in = new Scanner(System.in);
        System.out.println("Please, type your salary");
        double annualSalaray = in.nextDouble();

        double stateTax = 4.5;
        double federalTax = 7;
        double totalTax = (annualSalaray * (stateTax + federalTax)) / 100;
        double inCome = annualSalaray - totalTax;

        System.out.println("Annual salary: " + annualSalaray);
        System.out.println("Taxes: " + totalTax);
        System.out.println("Real income: " + inCome);


    }
}
