package day48_Inheritance.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int ID, String jobTitle, double salary, char gender){
        setInfo(name,ID,jobTitle,salary,gender);
    }

    public void fundingBugs(){
        System.out.println(name+ " is funding bugs");
    }

}
