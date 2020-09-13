package day35_ArraysList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList <String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");

        earlyBirdList.set(2, "Aslan");

        System.out.println(earlyBirdList);

        earlyBirdList.clear();
        System.out.println(earlyBirdList);

        System.out.println("===========================");

        ArrayList <Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);
        System.out.println(list);

        System.out.println("===========================");

        ArrayList <Integer>list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a = 1; //If you pass only the number it will remove the index, so you need to assigned to a Integer variable

        list2.remove(a);

        System.out.println(list);

        System.out.println("===========================");

        ArrayList <String> earlyBirdList1 = new ArrayList<>();
        earlyBirdList1.add("Ibrahim");
        earlyBirdList1.add("Virginia");
        earlyBirdList1.add("Ziiadin");
        earlyBirdList1.add("Erfan");
        earlyBirdList1.add("Aalia");

        earlyBirdList1.remove("Ziiadin");

        boolean r = earlyBirdList1.remove("ziiadin");

        System.out.println(earlyBirdList1);
        System.out.println(r);
    }
}
