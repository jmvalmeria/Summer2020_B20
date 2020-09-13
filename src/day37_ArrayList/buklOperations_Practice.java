package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class buklOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeen");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));

        System.out.println(r1);

        System.out.println("===============================================");
        ArrayList<Integer> numbers = new ArrayList<>();
        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100

        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(Arrays.asList(nums));

        System.out.println(numbers);
        System.out.println("===============================================");

        ArrayList<String> group24 = new ArrayList<>();
        // add all students names in your group
        group24.addAll(Arrays.asList("Abdugufur","Ahmed", "Alena", "Ali", "Eddie", "Fatih", "Fatma", "Gresa", "guljannat", "Hanna", "Mihrigul", "Jesus", "Omer", "Ramazan", "Vadym", "Zafer"));
        System.out.println(group24);

        //verify your mentor and one of your closest friend names are contained in the list
        boolean r2 = group24.containsAll(Arrays.asList("Gresa","Abdugufur"));
        System.out.println(r2);

        System.out.println("===============================================");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.addAll(Arrays.asList(1,1,1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(nums1);

        nums1.removeAll(Arrays.asList(1,2,5,10,11));
        System.out.println(nums1);

        System.out.println("===============================================");
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
        System.out.println(nums2);

        //only keep the elements that are 1, 2, 3, 9
        nums2.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(nums2);

    }
}
