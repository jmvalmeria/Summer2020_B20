package day44_Constructor;

public class Student {

    String name;
    int age;
    char gender;
    static String SchoolName = "Cybertek University";

    public Student(String name, int age, char gender){ //It is executed when the object is created
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /* We need to call it trough the class
    public void setInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }*/

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", School Name: "+SchoolName;
    }
}
