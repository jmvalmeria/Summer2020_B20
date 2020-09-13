package day24_Arrays;

public class ArrayUniques {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4};
        String result = "";

        for (int i = 0; i < arr.length; i++){ //It gets the first arr object
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++){ //It gets the rest objets out of the arr
                int numRepeat = arr[j];
                if (numRepeat == num){
                    count += 1;
                }
            }
            if (count == 1){
                result += num + " ";
            }
        }

        System.out.println(result);
    }
}
