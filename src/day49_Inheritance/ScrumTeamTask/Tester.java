package day49_Inheritance.ScrumTeamTask;

/*create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()*/

public class Tester extends Employee {

    public Tester(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age,gender,salary,ID,jobTitle);
    }

    public void smokeTesting(){
        System.out.println("Test " +name + " is runnig Smoke Test, while drinking coffee!");
    }

    public void creatingTicket(){
        System.out.println("Test " +name + " is creating a ticket on JIRA");
    }


}
