package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_Utility {
    /*
    Arrays: utility class for array
    Collections: utility for collection
    1. You need to import. import java.util.Collection;
     */

    /*
    sort(); //sorting number in ascending order
    swap(Arraylist, index1, index2); //The objects will be swap their position
    frequency(); //Number of occurency
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);

        System.out.println("=======================================");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        Collections.swap(list2,0,list2.size()-1); //It is use only if you want to swap one element with other element
        System.out.println(list2);

        System.out.println("=======================================");
        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('A');
        list3.add('B');
        list3.add('A');
        list3.add('A');
        list3.add('A');
        list3.add('C');

        int count = Collections.frequency(list3, 'A'); //It returns int
        System.out.println(count);

    }

}
