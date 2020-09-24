package day57_Polymorphism.EmployeeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {
        Employee tester1 = new Tester("Marinna",123456, "QA",120_000, 'F');
        Employee tester2 = new Tester("Elmira",234567, "SDET",122_000, 'F');
        Employee tester3 = new Tester("Hasan",345678, "QA",110_000, 'M');
        Employee developer1 = new Developer("Hajar",456789, "Junior Developer", 110_000, 'M');
        Employee developer2 = new Developer("Abdul",567891, "Senior Developer", 122_000, 'M');
        Employee developer3 = new Developer("Hanna",678912, "Senior Developer", 122_000, 'F');
        Employee developer4 = new Developer("Sarah",789123, "Junior Developer", 109_000, 'F');
        Employee scrumMaster1 = new ScrumMaster("Isabel",891234, "Scrum Master", 124_000, 'F');

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,developer1,developer2,developer3,developer4,scrumMaster1));

        for(Employee each : scrumTeam){
            System.out.println(each);
        }

    }
}
