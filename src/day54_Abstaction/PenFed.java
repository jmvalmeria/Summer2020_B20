package day54_Abstaction;

import java.time.LocalDate;

public class PenFed {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Polat Alemdar", 'M', LocalDate.of(1973,11,20), "KABADAYI",1500000);
        //tester1.gender = 'F'; //Can only read it, cannot modify it
        //tester1.DOfB = LocalDate.of(200,11,20); //Can only read it, cannot modify it

        Developer developer1 = new Developer("Virginia", 'F', LocalDate.of(1990,11,15), "Developer",120000);
        //developer1.gender = 'M'; //Can only read it, cannot modify it
        //developer1.DOfB = LocalDate.of(200,11,20); //Can only read it, cannot modify it
        System.out.println(developer1);


    }

}
