package day11_Nestedif_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 23;
        String citizen = "USA";

        String result = "";

        String result1 = (age >= 18 && citizen == "USA") ? "Can vote" : "Cannot vote";
        System.out.println(result1);

        System.out.println("=====================================");

        int num = 100;
        String result2 = " ";

        if (num>0){
            result = "positive";
        } else if (num < 0){
            result = "negative";
        }else {
            result = "Zero";
        }

        System.out.println(result);

        System.out.println("=============================");

        //In ternary

        String result3 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result3);

        System.out.println("=============================");
        // Write a program that can compare two numbers, which is grater
        int a = 20, b = 20;

        String result4 = (a > b) ? "a is greater" : (a < b) ? "b is greater" : "a is equal to b";
        System.out.println(result4);
        System.out.println("=============================");

        String result5 = (a > b) ? a + " is greater" : (a < b) ? b + " is greater" : a + " is equal to " + b;
        System.out.println(result5);
    }
}
