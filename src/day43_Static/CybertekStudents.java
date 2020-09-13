package day43_Static;

class A{
    static int a = 200;
}


public class CybertekStudents {

    String studentName;
    int age;
    char gender;
    static String SchoolName = "Cybertek School";

    public void getInfo(){
        System.out.println("Name: "+studentName);
    }

    public static void printSchoolName(){
        System.out.println("School Name: "+SchoolName);
    }

}
