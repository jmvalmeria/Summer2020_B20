package day23_Arrays;

import java.util.Scanner;

public class FrecuencyAndCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine(); //"A2B2"
        String nonDup = ""; //AB
        String result = "";

        for (int i =0; i < str.length(); i++){ //It's remove the duplication
           String ch = "" + str.charAt(i); // A, B, A, B
            if (!nonDup.contains(ch)){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        //str ="ABAB"  nonDup = "AB"
        for (int j = 0; j < nonDup.length(); j++){
            char ch = nonDup.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ch){
                    count += 1;
                }
            }

            result += "" + nonDup.charAt(0) + count;
        }


        System.out.println(result);
    }
}
