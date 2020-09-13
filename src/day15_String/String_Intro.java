package day15_String;

import java.lang.String; //It is not need to import it, it is automatically import
import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Cybertek"; // String literal, store in the String Pool, special place for Strings
        String name = new String("Cybertek"); //By using new Keyword, store in the Java Heap, for all the objects

        String s1 = "Cat";//String literal
        String s2 = "Cat";//String literal
        System.out.println(s1 == s2);

        System.out.println("=====================================");

        //No duplication in String Pool, so in case on top we only have 1 object

        //Using by new Keyword
        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1 == t2);
        //They are different object located in different part of the Java Heap




    }
}
