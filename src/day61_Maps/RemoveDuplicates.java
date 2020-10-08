package day61_Maps;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        /*3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order*/

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        list.clear(); //It clear the list original so we can addAll the elements from set "LinkedHasSet"
        list.addAll(set);

        System.out.println(list);

    }

}
