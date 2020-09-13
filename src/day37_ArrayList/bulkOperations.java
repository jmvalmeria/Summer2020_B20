package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1); //true

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);

        list.containsAll(elements); //We passed a collection type to verify if the contained elements are contained in the previous List

        boolean r2 = list.containsAll(elements);
        System.out.println(r2); //It returns you true

        System.out.println("======================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        //verify that 1,2,4 are contained in the list2

        boolean r3 = list2.containsAll(Arrays.asList(1,2,4)); //Arrays.aslist(num) take the elements as an Array and resturns boolean

        Integer[] arr = {10,20,4};
        boolean r4 = list2.containsAll(Arrays.asList(arr));//Remember it does not support non-primitive arrays

    }
}
