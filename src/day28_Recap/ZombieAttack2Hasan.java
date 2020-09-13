package day28_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2Hasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }*/
        //TODO. Write you code below this line.
        int[] inhabitants = {0, 20, 0, 20, 20, 10, 0, 10};
        int count = 0, sumInhabitants = 0;

        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

        do {

            for (int i = 0; i < inhabitants.length; i++) {

                if (i < inhabitants.length - 1) {

                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                        inhabitants[i] /= 2;
                    }

                    if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                        inhabitants[i + 1] /= 2;
                        i++;
                    }
                }
            }
            sumInhabitants = 0;

            for (int each : inhabitants) {
                sumInhabitants += each;
            }

            count++;
            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        } while (sumInhabitants > 0);

        System.out.println("---- EXTINCT ----");
    }
}
