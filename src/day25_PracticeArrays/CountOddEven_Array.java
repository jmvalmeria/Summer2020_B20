package day25_PracticeArrays;

public class CountOddEven_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int count0dd = 0;
        String Even = "";
        String Odd = "";

        for (int each : arr){
            if (each % 2 == 0){
                countEven++;
                Even += each + " ";
            } else {
                count0dd++;
                Odd += each + " ";
            }
        }

        System.out.println("The Even numbers are: " + Even);
        System.out.println("There is " + countEven + " Even numbers");
        System.out.println();
        System.out.println("The Odd numbers are: " + Odd);
        System.out.println("There is " + count0dd + " odd numbers");

    }
}
