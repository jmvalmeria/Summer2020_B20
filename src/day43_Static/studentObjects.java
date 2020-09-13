package day43_Static;

public class studentObjects {

    public static void main(String[] args) {
        CybertekStudents obj1 = new CybertekStudents();
        obj1.studentName = "Ivan";

        CybertekStudents obj2 = new CybertekStudents();
        obj2.studentName = "Cristina";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

    }
}
