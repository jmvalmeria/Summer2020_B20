package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};

        char[][] cd2D = {{'A','B'} , {'C','D','E'} , {'F','G','H'}};
        //                  0               1               2

        System.out.println(Arrays.toString(cd2D[1]));

        System.out.println(cd2D[2][2]);
        System.out.println(cd2D[1][0]);

        char[][] cd2Dbis = {ch1,ch2,ch3};


        System.out.println("======================================");
        int[][] arr = {{1,2,3} , {4} , {5,6} , {7,8,9,10}};

        //Output = [7,8,9,10]
        System.out.println(Arrays.toString(arr[3]));

        for (int i = 0; i < 4; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
