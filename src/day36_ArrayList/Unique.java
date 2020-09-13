package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
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
            int count = Collections.frequency(arrayList1, each);

            if (count == 1){
                uniques.add(each);
            }
        }

        System.out.println(uniques);
    }
}
