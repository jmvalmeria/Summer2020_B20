package day24_Arrays;

import java.util.Scanner;

public class ForEachLoopNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, how many people will be:");
        int NumPeople = in.nextInt();

        int count = 1;
        String[] listPeople = new String[NumPeople];

        for (int i = 0; i < NumPeople; i++){

            System.out.println("Please, type name #" + count +":");
            listPeople[i] = in.next();
            count++;

        }

        System.out.println();
        System.out.println("=============================");

        for (String each : listPeople){
            System.out.println(each);
        }

    }
}
