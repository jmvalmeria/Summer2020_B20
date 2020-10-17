package day62_Maps.WarmUpTaskMyWay;

import java.util.*;

public class WarmUp2 {
    /*2. write a program that stores the unique characters from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}*/

    public static void main(String[] args) {

        String str = "abacbdeef";
        ArrayList<String> listStr = new ArrayList<>();
        listStr.addAll(Arrays.asList(str.split("")));

        Map<String,Integer> Uniques = new HashMap<>();

        for (int i = 0; i < listStr.size(); i++){
            if(Collections.frequency(listStr,listStr.get(i)) == 1){
                Uniques.put(listStr.get(i),Collections.frequency(listStr,listStr.get(i)));
            }
        }

        System.out.println(Uniques);

    }

}
