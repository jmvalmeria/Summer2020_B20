package day61_Maps;

import java.util.*;

public class RemoveEvens {

    public static void main(String[] args) {

        /*2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions*/

        Integer[] num = {111,113,100,900,90,80,76,120,55,22,23,45,65,6,9};

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(num));

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            Integer each = it.next();

            if(each%2==0){
                it.remove();
            }
        }

        System.out.println(set);

    }

}
