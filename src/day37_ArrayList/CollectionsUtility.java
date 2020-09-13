package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000));

        System.out.println("Maximum number:" + Collections.max(list)); //Use to find the maximum number out of a collection
        System.out.println("Minimum number:" + Collections.min(list)); //use to find the minimum number out of a collection


        System.out.println("===========================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan", "Islem", "Muhtar", "Saim", "Muhtar", "Asiya"));

        //replaceAll
        Collections.replaceAll(names, "Muhtar", "Fatime"); //Replace the elements with a new value

        System.out.println(names);

        //removeIf();
        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(1,1,2,2,2,3,4,5,6));

        numList.removeIf(p -> Collections.frequency(numList,p) == 1);
        System.out.println(numList);

        System.out.println("=========================================");

        ArrayList<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        names1.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));

        System.out.println(names1);

        System.out.println("=========================================");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); //90 to  100
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p -> !(p >= 90 && p <= 100));

        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 to  89
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p -> !(p >= 80 && p <= 89));

        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 to 79
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p -> !(p >= 70 && p <= 79));

        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 to 69
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p -> !(p >= 60 && p <= 69));

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // below 60
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p -> !(p >= 0 && p <= 59));
        System.out.println(gradeOfF);

        System.out.println("Number of studens with grade:" + "\nA: " + gradeOfA.size()
                                                           + "\nB: " + gradeOfB.size()
                                                           + "\nC: " + gradeOfC.size()
                                                           + "\nD: " + gradeOfD.size()
                                                           + "\nF: " + gradeOfF.size()
                                                           + "\nHow many failed? " + gradeOfF.size());

        /*
        How many students made:
        A?
        B?
        C?
        D?
        F?
        How many failed?
         */


    }
}
