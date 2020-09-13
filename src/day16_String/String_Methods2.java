package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {
        //isEmpty(); check if the String is empty and it returns boolean
        String ms1 = "Jesús";
        String ms2 = "";

        System.out.println(ms1.isEmpty());
        System.out.println(ms2.isEmpty());

        System.out.println("================================================");
        //equal(); Compare de values
        //Reason
        String str1 = "Java"; //Save in String pool
        String str2 = new String("Java"); //Save in the Java Heap

        System.out.println(str1 == str2); //returns false
        System.out.println(str1.equals(str2)); //returns true because it check the contens

        System.out.println("================================================");

        //equalsIgnoreCase(); Ignore character sensitivity

        String  answer = "YeS";
        String result = (answer.equalsIgnoreCase("yes")) ? "Employeed" : "Not employeed";

        System.out.println(result);

        System.out.println("================================================");

        //contains(); Check if the String has that contents
        String str = "I like to learn java programming language";

        System.out.println(str.contains("python")); //Contents
        System.out.println(!str.contains("python")); //Not contents

        System.out.println("================================================");

        //startsWith(); Check if the String starts with
        String s1 = "Jesus";
        System.out.println(s1.startsWith("Je"));

        System.out.println("================================================");

        //endsWith(); Check if the String ends with


    }
}
