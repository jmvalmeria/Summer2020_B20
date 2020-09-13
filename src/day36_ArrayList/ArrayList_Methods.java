package day36_ArrayList;

import java.util.ArrayList;

/*
indexOf();
lastIndexOf();
contains();
equals();
isEmpty();
 */

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);

        int a = list.indexOf(40); //Returns int

        System.out.println(a);
        System.out.println(list.indexOf(60));//If it is give us a negative number, it means that the element does not exist

        System.out.println("===============================================");

        int b = list.lastIndexOf(40); //returns int
        System.out.println(b);

        System.out.println("===============================================");

        boolean r1 = list.contains(40); //Returns boolean, check in the packet RemoveDuplicatesFromArrayList
        System.out.println(r1);

        System.out.println("===============================================");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek");

        ArrayList<String> list2 = new ArrayList<>();
        list1.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2)); //We cannot use "==" equals operator but the method equals(); There is NOT equalIgnoreCase(), because it is create for all kind of data
                                                 //It returns boolean
        System.out.println("===============================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty()); //It returns boolean and check if Arraylist is empty


    }
}
