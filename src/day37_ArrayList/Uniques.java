package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        /*Warmup Tasks:
        1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
        2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
*/
        String str = "ABABCDEE";
        String uniques= "";

        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")){
            list.add(each);
        }

        System.out.println(list);

        for (String each : list){
            int count = Collections.frequency(list, each);
            if(count == 1){
                uniques += each;
            }
        }

        System.out.println(uniques);


        System.out.println("================================================");

        String str1 = "AAABBC";
        ArrayList<String>  list1 = new ArrayList<>();
        String nonDup = Util.removeDup(str1);

        for(String each : str.split("")){
            list1.add(each);
        }

        for (String each : list1){
            int count = Collections.frequency(list1,each);
            System.out.println(each + count);
        }

        System.out.println(list);



    }
}
