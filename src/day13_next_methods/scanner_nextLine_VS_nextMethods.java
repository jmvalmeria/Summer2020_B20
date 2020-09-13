package day13_next_methods;

import java.util.Scanner;

public class scanner_nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, type your salary: ");
        double salary = in.nextDouble(); //You input the salary and enter

        in.nextLine(); //This solve the bug to accept the enter, we use one time so we do not reuse the

        System.out.println("Please, type your full name: ");
        String fullName = in.nextLine(); //It accept the enter and it doesn't allowed you to fill the code

        System.out.println("Salary: $" + salary);
        System.out.println("Full name: " + fullName);
    }
}
