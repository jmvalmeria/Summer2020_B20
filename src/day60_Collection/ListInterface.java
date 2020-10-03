package day60_Collection;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(); //get, add, remove, set, removeAll, contains, size...
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("ArrayList: " + list1);
        System.out.println(list1.get(2));// This one is the fastest
        list1.add(6);

        //This one is the fastest to add and remove objects
        List<Integer> list2 = new LinkedList<>(); //get, add, remove, set, removeAll, contains, size...
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList: " +list2);
        System.out.println(list2.get(2));
        list2.add(6);

        //This is thread safe, one at the time other thread has to wait, using synchronize keyword
        List<Integer> list3 = new Vector<>(); //get, add, remove, set, removeAll, contains, size...
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vector: " +list3);
        System.out.println(list3.get(2));
        list3.add(6);

        List<Integer> list4 = new Stack<>(); //get, add, remove, set, removeAll, contains, size...
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list4.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack: " +list4);
        System.out.println(list4.get(2));
        list4.add(6);
        ((Stack)list4).pop();

        System.out.println(list4);

        System.out.println("=============================================");
        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list5);

        int lastObject = list5.pop();

        System.out.println(list5);

        int lastObject2 = list5.pop();

        System.out.println(list5);

        list5.removeAll(Arrays.asList(1,4,5));

        System.out.println(list5);
        System.out.println("=============================================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = {{1,2,3,4},{5,6,7,8,9}}; //Multidimensional Array


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");

        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>(); //List of Lists
        l2.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        l2.add(new ArrayList<Integer>(Arrays.asList()));
        l2.get(1).addAll(Arrays.asList(5,6,7,8,9));

        l2.get(0).removeAll(Arrays.asList(1,3));
        System.out.println(l2);

        System.out.println("Size of first arrayList: " + l2.get(0).size());
        System.out.println("Size of second arrayList: " + l2.get(1).size());


        /*
        1. add 5 different names in each group
        2. iterate the list of lists (groups)
        3. print out the name of each student
         */

        List<String> group1 = new ArrayList<>(Arrays.asList("Ali","Alena","Ramazan","Mikri","Abdu"));
        List<String> group2 = new ArrayList<>(Arrays.asList("Marat","Elmira","Hanna","Mustafa","Bulet"));
        List<String> group3 = new ArrayList<>(Arrays.asList("Nickolas","Evgeniya","Aizhan","Kalbinur","Paola"));
        List<String> group4 = new ArrayList<>(Arrays.asList("Natalia","Hasan","Ramazan","Hannah","Abdu"));
        List<String> group5 = new ArrayList<>(Arrays.asList("Cristina","Tetiana","Ziiadin","Zeliha","Ebrahim"));

        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(group1,group2,group3,group4,group5));

        int count = 1;
        for (List<String> each: groups){
            System.out.println("Number of the group " + count +": " + each);
            count++;
        }

        System.out.println();

        for (int i = 0; i < groups.size(); i++){
            for (int j = 0; j < groups.size(); j++){
                System.out.println(groups.get(i).get(j));
            }
        }


    }

    public void method1(){

    }

    public synchronized void method2(){

    }

}
