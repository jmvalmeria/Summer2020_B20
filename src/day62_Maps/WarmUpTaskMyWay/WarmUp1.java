package day62_Maps.WarmUpTaskMyWay;

import java.util.*;

public class WarmUp1 {

    public static void main(String[] args) {

        /*1. Write a program that stores the the character and frequency of each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
    */

        String str = "aaabbbccb";
        String uniques = "";

        for (int i = 0; i < str.length(); i++){
            if (!uniques.contains(""+str.charAt(i))){
                uniques += str.charAt(i);
            }
        }

        String[] arrUniques = uniques.split("");
        String[] arrOriginal = str.split("");

        ArrayList<String> listOriginal = new ArrayList<>();
        listOriginal.addAll(Arrays.asList(arrOriginal));

        Map<String,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arrUniques.length; i++){
            int letterFrecuency = Collections.frequency(listOriginal,arrUniques[i]);
            frequencyMap.put(arrUniques[i],letterFrecuency);
        }

        System.out.println(frequencyMap);

    }

}
