package day54_Abstaction;

import java.time.LocalDate;

public class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name + " found a bug");
    }

}
