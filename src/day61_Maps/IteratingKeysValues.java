package day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();
        students.put("Hasa", LocalDate.of(1985,4,4));
        students.put("Jesus", LocalDate.of(1979,1,31));
        students.put("Muhtar", LocalDate.of(1985,5,19));
        students.put("Jesus", LocalDate.of(1979,2,28));
        students.put("Muhtar", LocalDate.of(1985,4,3));
        students.put("John", LocalDate.of(1999,3,4));

        System.out.println(students);

        Set<String> keys = students.keySet();

        //This is the way to applying the loop for the key
        for(String each : students.keySet()){
            System.out.println(each);
        }

        System.out.println("================================================");

        //This is the way to applying the loop for the values
        for(LocalDate each: students.values()){
            System.out.println(each);
        }


        System.out.println("================================================");

        /*create a map that can contain student name and score
        put 5 of your class mates names and thier score
        print out the name of students who made less than 80
        */

        Map<String,Integer> studentsGrades = new LinkedHashMap<>();
        studentsGrades.put("Hanna",94);
        studentsGrades.put("Jesus",74);
        studentsGrades.put("Elmira",97);
        studentsGrades.put("Ali",92);
        studentsGrades.put("Mikri",95);

        for (String each : studentsGrades.keySet()){
            int value = studentsGrades.get(each);
            if (value <= 80){
                System.out.println(each);
            }
        }


    }

}
