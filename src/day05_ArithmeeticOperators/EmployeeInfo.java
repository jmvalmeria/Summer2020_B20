package day05_ArithmeeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {
        // Variables
        String firstName = "John";
        String lastName = "Daniel";
        String gender = "Male";
        int age =35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        //Output
        System.out.println();
        System.out.println("****************************************************");
        System.out.println("CapitalOne Employees \n****************************************************");
        System.out.println("* " + "Employee's full name is: " + firstName +" "+ lastName);
        System.out.println("* " + firstName +" "+ lastName + "'s gender is: " + gender);
        System.out.println("* " + firstName +" "+ lastName + "'s age is: " +  age + " years old");
        System.out.println("* " + firstName +" "+ lastName + " works at: " + companyName);
        System.out.println("* " + firstName +" "+ lastName + "'s Job title is: " + jobTitle);
        System.out.println("* " + firstName +" "+ lastName + "'s salary is " + salary + " $");
        System.out.println("* " + firstName +" "+ lastName + " is full time employee: " + isFullTime);
        System.out.println("* " + firstName +" "+ lastName + " is married: " + isMarried);
        System.out.println("****************************************************");

    }
}
