package day41_Static;

import java.text.DecimalFormat;

public class Developer {
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

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void fixBugs(){
        System.out.println(name+ " is crying");
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: $"+df.format(salary);
    }
}

class DeveloperObjects{
    public static void main(String[] args) {
        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};

        developers[0].setInfo("Ahmet",125_000.325, "Male", 30);
        developers[1].setInfo("Erfan",150_000.75, "Male", 29);
        developers[2].setInfo("Arpat",150_000.325, "Male", 27);
        developers[3].setInfo("Ajit",120_000.525, "Male", 30);
        developers[4].setInfo("Massimo",180_000.325, "Male", 36);

        for (Developer each : developers){
            each.coding();
        }

        System.out.println("==============================================");

        for (int i=0; i < developers.length; i++){
            developers[i].fixBugs();
        }

    }
}
