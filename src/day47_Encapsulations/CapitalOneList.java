package day47_Encapsulations;

public class CapitalOneList {

    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("Elmira",27, "QA");
        CapitalOneEmployees employee2 = new CapitalOneEmployees("Marianna",40, "QA");

        employee1.setID(123456);
        employee2.setID(321654);
        employee1.setAddress("245 Hills Street, Pittsburgh PA");
        employee2.setAddress("2456 Mongomery Street, Pittsburgh PA");
        employee1.setSalary(120_000.21);
        employee2.setSalary(127_000.15);

        System.out.println("Name: " + employee1.employeeName + " Age: " +employee1.employeeAge + " Job Title: " +employee1.jobTitle);
        System.out.println("Name: " + employee2.employeeName + " Age: " +employee2.employeeAge + " Job Title: " +employee2.jobTitle);
        System.out.println();
        System.out.println();

        System.out.println(CapitalOneEmployees.companyName);
        System.out.println("=========================================================");
        System.out.println("Employee Name:" + employee1.employeeName + " ID:" + employee1.getID());
        System.out.println("Employee Name:" + employee1.employeeName + " Address:" + employee1.getAddress());
        System.out.println("Employee Name:" + employee1.employeeName + " Salary:" + employee1.getSalary());
        System.out.println("=========================================================");
        System.out.println("Employee Name:" + employee2.employeeName + " ID:" + employee2.getID());
        System.out.println("Employee Name:" + employee2.employeeName + " Address:" + employee2.getAddress());
        System.out.println("Employee Name:" + employee2.employeeName + " Salary:" + employee2.getSalary());
        System.out.println("=========================================================");
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
