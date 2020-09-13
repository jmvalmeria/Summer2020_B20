package day41_Static;

import java.text.DecimalFormat;

public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: $"+df.format(salary);
    }

}

class TesterObject{
    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 150_000, "Female", 18);
        testers[1].setInfo("Naz", 150_000, "Female", 18);
        testers[2].setInfo("Kalbinur", 155_000, "Female", 21);
        testers[3].setInfo("Rakhat", 130_000, "Female", 28);
        testers[4].setInfo("Edward", 110_000, "Female", 30);

        for(Tester each: testers){
            System.out.println(each);
        }


    }
}
