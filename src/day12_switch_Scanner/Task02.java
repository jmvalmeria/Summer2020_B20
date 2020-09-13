package day12_switch_Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF*/

        int age = 10;

        if (age >= 0 && age <= 150){
            String result = (age < 21) ? "Teenager" :
                            (age >= 21 && age <= 55) ? "Adult" :
                            "Senior";
            System.out.println(result);
        } else {
            System.out.println("Invalid, age!");
        }
    }
}
