package day49_Inheritance.ScrumTeamTask;

/*create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo*/


public class Person {

    public String name;
    public int age;
    public char gender;
    private long ssn;

    public long getSsn(){ //read only
        return ssn;
    }

    public void setSsn(long ssn){ //set only
        this.ssn = ssn;
    }

    public void setInfo(String name, int age, char gender){ //Only sets name, Age, Gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void eat(){ //We dont need to be inherited to the sub class
        System.out.println(name + " is eating");
    }

    private void sleep(){ //We dont need to be inherited to the sub class
        System.out.println(name + " is sleeping");
    }

    private void walk(){ //We dont need to be inherited to the sub class
        System.out.println(name + " is walking");
    }

}
