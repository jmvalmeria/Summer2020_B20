package day60_Collection;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,5,4,3,2,10,7,1)); //It does NOT keep the insertion order
        s1.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8)); //It does NOT accept duplicate values
        System.out.println("HashSet: " + s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,5,4,3,2,10,7,1)); //It keeps the insertion order
        s2.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8));// It does NOT accept duplicate values
        System.out.println("Linked HasSet: " + s2);


        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(8,5,4,3,2,10,7,1)); //It does NOT accept null keyword
        s3.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8));// It does NOT accept duplicate values
        System.out.println("Tree Set: " + s3);
    }

}
