package day26_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {

        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] sm = {"Numamet"};
        String[] po = {"Nadir"};
        String[] ba = {"Alex"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};

        String[][] scrumTeam = {testers,developers,sm,po,ba};
        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[0] = testers2;

        scrumTeam[1][2] = "Emine";

        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("=================================================");

        for (String[] each : scrumTeam){
            for (String element : each){
                System.out.println(element);
            }
            //System.out.println(Arrays.toString(each));
        }

        System.out.println("=================================================");
        int[][] scores = {{10,20,30,45},{60,55,75,105},{93,48,125,135}};

        for (int[] each : scores){
            for (int num : each){
                if (num % 3 == 0 || num % 5 == 0){
                    System.out.print(num + " ");
                }
            }

        }

    }
}
