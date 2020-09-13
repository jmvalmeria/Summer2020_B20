package day47_Encapsulations;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    private int ssn;
    private int ID;
    private String address;

    public Person(String name, int age, char gender, LocalDate dateOfBirth){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Date of Birth: "+dateOfBirth;
    }


}
