package day28_Recap;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        //TODO. Write you code below this line.
        /*Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }*/

        //TODO. Write you code below this line.
        int[] inhabitants = {0, 20, 0, 20, 20, 10, 0, 10};
        int index = 0;


        do{
            int sumInhabitants = 0;

            //It count the population left
            for (int each : inhabitants){
                sumInhabitants += each;
            }

            //If there is no population it is going to executed
            if (sumInhabitants == 0) {
                System.out.println("Day " + index + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                break;
            //If there are some population it is going to executed
            } else {

                System.out.println("Day " + index + " " + Arrays.toString(inhabitants));
                index++;

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

            }

        } while (true);

    }
}