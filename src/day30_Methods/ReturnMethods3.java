package day30_Methods;

import java.util.Arrays;

public class ReturnMethods3 {

    public static void main(String[] args) {
        int[] arr = {100, 200, 50, 40, 60};
        System.out.println(max(arr) > 300);
    }

    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
