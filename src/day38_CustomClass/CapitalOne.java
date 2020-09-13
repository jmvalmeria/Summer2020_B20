package day38_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setEmployeeName("Roman", 'M', 1234567867, "QA", 120_000);
        employee1.getEmployeeInfo();
        employee2.setEmployeeName("Anna", 'F', 1234567867, "PO", 121_000);
        employee3.setEmployeeName("Marat", 'M', 1234567867, "QA", 115_000);
        employee4.setEmployeeName("Hanna", 'F', 1234567867, "QA", 110_000);
        employee5.setEmployeeName("Muhtar", 'M', 1234567867, "SME", 130_000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

        double max = Integer.MIN_VALUE;
        String name = "";
        for (Employee each : employeeList){
            each.getEmployeeInfo();
            if (each.salary > max){
                max = each.salary;
                name = each.name;
            }
        }


        System.out.println();
        System.out.println(name + " has the maximum salary: $" + max);

        //employeeList.removeIf(p-> p.salary > 135000);
        //employeeList.removeIf(p-> p.jobTitle.equals("QA"));
        employeeList.removeIf(p -> p.name.toLowerCase().contains("m"));
        
        for (Employee each : employeeList){
            System.out.println(each.name + " : " + each.salary);
        }

    }
}
