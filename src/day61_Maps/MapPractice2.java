package day61_Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

/*create a map that can contain student name and score
        put 5 of your class mates names and thier score
        print out the name of students who made less than 80
        */

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Shakhzod", 89);
        students.put("Ceren", 95);
        students.put("Fatime", 85);
        students.put("Kalbinur", 98);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        students.put("Ali", 95 );
        students.put("Adam", 93 );
        students.put("Murat", 79 );
        students.put("Cihan", 100);
        students.put("John", 71);

        LinkedHashMap<String,Integer> earlyBirds = new LinkedHashMap<>(); //score >=95
        LinkedHashMap<String,Integer> angryBirds = new LinkedHashMap<>(); //score < 95

        for (String each : students.keySet()){
            Integer value = students.get(each);
            if (value >= 95){
                earlyBirds.put(each,value);
            }else {
                angryBirds.put(each,value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

    }
}
