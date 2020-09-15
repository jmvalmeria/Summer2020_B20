package day54_Abstaction;

import java.time.LocalDate;

public final class Developer extends Employee {


    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }
}
