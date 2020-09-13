package day48_Inheritance.EmployeeTask;

public class EmployeeList {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Jesus",123456,"QA",135_000,'M');
        Developer dev1 = new Developer("Marianna", 456789,"Front-End Dev", 155_356.63,'F');

        System.out.println(tester1);
        System.out.println(dev1);


    }

}
