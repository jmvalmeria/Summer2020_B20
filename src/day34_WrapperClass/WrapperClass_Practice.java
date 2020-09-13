package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4}; //We can create a Array out of Wrapper Class
        for(int each : arr2){
            System.out.println(each);
        }

        System.out.println("===========================================");

        double[] arr3 = {1,2,3,4,5,6,7};
        //Double[] arr4 = {1,2,3,4,5,6,7};//Compile error, because the type of data
        Double[] arr4 = {1.0,2.0,3.2,4.3,5.4,6.4,7.2};

        for (double each : arr4){
            System.out.println(each);
        }

        System.out.println("===========================================");

        char[] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);

        System.out.println("===========================================");

        String[] num1 = {"12.5", "13.2", "14.3", "15.4"};
        double[] num2 = new double[num1.length];

        for (int i = 0; i < num1.length; i++){
            num2[i] = Double.parseDouble(num1[i]);
        }

        System.out.println(Arrays.toString(num2));


    }
}
