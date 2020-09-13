package day15_String;

import java.lang.ref.SoftReference;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Cybertek";
        //     index = 01234567


        //CharAt(index);
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch1 + " " + ch2);

        System.out.println("======================================================");

        //length(); (How many characters you have in a String, return it as a Int
        int howMany = name.length();
        System.out.println(howMany); //It is count from 1

        //How to get the last character index number of the elements is the lenght - 1
        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        //to get the last character
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        System.out.println("=========================================");

        //concat(), concatenation
        String schoolName = "Cybertek";
        String concatMessage = schoolName.concat(" School"); //Only can concatenate other String
        System.out.println(concatMessage);

        System.out.println("==========================================");

        //toLowerCase();
        String name1 = "CYBERTEK SCHOOL";
        System.out.println(name1.toLowerCase());

        System.out.println("==========================================");

        //toUpperCase();
        String name2 = "jesus";
        System.out.println(name2.toUpperCase());

        System.out.println("==========================================");

        //trim();
        String p = "     Cybertek School         "; //But it is not remove space between words
        p = p.trim();
        System.out.println(p);

        System.out.println("==========================================");

        //substring();



    }
}
