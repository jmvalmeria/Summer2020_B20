package day29_CustomMethods;

public class MaximunMinimum {

    public static void main(String[] args) {
        int[] arr = {10, 9, 111, 2000, 10, 30, -100, -200 };

        max(arr);
        min(arr);
    }

    public static void max(int[] num){
        int max = num[0];
        for (int each : num){
            if (each > max){
                max = each;
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println();
    }

    public static void min(int[] num){
        int min = num[0];
        for (int each : num){
            if (each < min){
                min = each;
            }
        }

        System.out.println("The minimum number is: " + min);
        System.out.println();
    }
}
