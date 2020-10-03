package day60_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String str = "aaabbbccccddddeeee"; //abcde

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));

        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr));

        System.out.println(s1);

        System.out.println("====================================");
        String str2 = "zzzyyyxxx";
        str2 = new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str2);

        str2 = str2.replace("[", "").replace("]", "").replace(", ","");
        System.out.println(str2);

        System.out.println("====================================");
        String a1 = "abcabc";
        String a2 = "cab";

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));
        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));
        System.out.println(b2);

        System.out.println(b1.equals(b2));

        a1 = b1.toString();
        a2 = b2.toString();

        System.out.println(a1.equals(a2));

        System.out.println("====================================");

        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

        x1 = new TreeSet<>(Arrays.asList(x1.split(""))).toString();
        x2 = new TreeSet<>(Arrays.asList(x2.split(""))).toString();
        System.out.println(x1.equals(x2));

        System.out.println("====================================");

        String[] names = {"Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Virginia"};
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));

        names = set1.toArray(new String[0]); //This is the way to convert any collection type to an array
        System.out.println(Arrays.toString(names));

        System.out.println("====================================");
        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman"};
        names2 = new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]);
        System.out.println(names2.toString());


        System.out.println("====================================");
        Integer[] numbers = {1,1,1,2,2,2,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};
        numbers = new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);
        System.out.println(numbers.toString());

    }


}
