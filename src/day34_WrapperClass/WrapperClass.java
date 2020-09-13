package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 100; //It is a class that only accepts the defined values
        int a = 100;

        Integer n3 = new Integer(123);
        int[] arr = new int[3]; //[0,0,0]
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = new  Integer[3]; //[null,null,null]
        System.out.println(Arrays.toString(arr1));

        int p1 = 300;
        Integer p2 = p1; //Autoboxing

        Integer q1 = 500;
        int q2 = q1; //Unboxing

        // Double r1 = 300; //Wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1; //Unboxing

        long l1 = 300;
        Long l2 = l1; //Autoboxing

    }
}
