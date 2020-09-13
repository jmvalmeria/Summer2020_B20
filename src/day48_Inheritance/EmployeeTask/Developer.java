package day48_Inheritance.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, int ID, String jobTitle, double salary, char gender){
        setInfo(name,ID,jobTitle,salary,gender);
    }

    public void fixingBugs(){
        System.out.println(name+ " is fixing bugs");
    }


}
