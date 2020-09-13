package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        ArrayList<Integer> reverse = new ArrayList<>();

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--){
            reverse.add(list.get(i));
        }

        System.out.println(reverse);
    }
}
