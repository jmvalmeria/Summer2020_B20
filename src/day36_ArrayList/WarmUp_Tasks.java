package day36_ArrayList;

import java.util.ArrayList;

public class WarmUp_Tasks {
    /*warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}*/


    public static void main(String[] args) {
        //Task01
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list1.set(list1.size()-1, 0);

        System.out.println(list1);

        System.out.println("======================================");
        //Task02
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <=20; i++){
            list2.add(i);
        }

        System.out.println(list2);

        for (int i = 0; i< list2.size(); i++){
            if (list2.get(i) % 2 != 0){
                list2.set(i, list2.get(i) * 2); //Instead of using assign operator you need to call it and sustitud the elemente
            }
        }

        System.out.println(list2);

        System.out.println("======================================");

        //Task03
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : arrayList1){
            int count = 0;
            for (Integer element : arrayList1){
                if (each == element){
                    count++;
                }
            }

            if (count == 1){
                uniques.add(each);
            }
        }

        System.out.println(uniques);
    }
}
