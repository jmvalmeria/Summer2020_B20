package day44_Constructor;

public class StudentsObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Mike", 18, 'M');
        Student student2 = new Student("Rakhat", 28, 'F');
        Student student3 = new Student("Belek", 30, 'M');

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }

}
