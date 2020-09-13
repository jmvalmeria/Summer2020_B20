package day48_Inheritance.EmployeeTask;

/*Employee Task:
        1. super class: Employee
                    variables: salary, name, id, jobTitle, gender
                    methods: setInfo, toString
        2. Sub classes:
                    2.1 Tester:
                            variables:  salary, name, id, jobTitle, gender
                                add a constructor that can set the fields
                            methods: fundingBugs, setInfo, toString
                    2.2 Developer:
                            variables:  salary, name, id, jobTitle, gender
                                add a constructor that can set the fields
                            methods: fixingBugs, setInfo, toString*/

public class Employee {

    public String name;
    public int ID;
    public String jobTitle;
    public double salary;
    public char gender;

    public void setInfo(String name, int ID, String jobTitle, double salary, char gender){
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return  "======================================"+
                "\nName: "+name+
                "\nID: "+ID+
                "\nJob Title: "+jobTitle+
                "\nSalary: "+salary+
                "\nGender: "+gender+
                "\n======================================";
    }

}
