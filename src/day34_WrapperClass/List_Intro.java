package day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList <Integer> score = new ArrayList<>();
        score.add(95); //Autoboxing, index 0
        score.add(100); //Autoboxing, index 1
        score.add(85); //Autoboxing, index 2
        score.add(75);
        score.add(1,65);
        //score.add(7,55); // You CANNOT skip indexes, if it is so it'll give you Exception
        score.add(55);

        System.out.println(score);

        System.out.println(score.get(2)); //Return as Integer Wrapper Class

        ArrayList <Integer> nums = new ArrayList<>();
        for (Integer i = 1; i <= 1000; i++){
            nums.add(i);
        }

        System.out.println(nums);

    }
}
