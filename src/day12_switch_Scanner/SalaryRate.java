package day12_switch_Scanner;

import java.util.Scanner;

public class SalaryRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pleas, type your salary: ");
        double salary = in.nextInt();

        System.out.println("Please, now type the number of hour per week that you work: ");
        int hourPerWeek = in.nextInt();
        int totalHours = hourPerWeek * 52;

        double hourlyRate = salary / hourPerWeek;

        System.out.println("Your hourly rate is: $" + hourlyRate);

        
    }
}
