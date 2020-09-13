package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    public Constructor(){
        System.out.println("No arg");
    }

    public Constructor(int a){ //Overloading the constructor but using different arguments
        System.out.println("int argument");
    }

    public Constructor(String a){
        System.out.println("String argument");
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2 = new ArrayList<>(list1); //Multiple constructors give us other abilities
        System.out.println(list2);
    }

}
