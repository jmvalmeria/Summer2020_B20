package day11_Nestedif_Ternary;

public class NumberToWords {
    public static void main(String[] args) {
        /*1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
         */

        int num1 = 10;
        String outPut = "";
        if (num1 == 0){
            outPut = "Zero";
        } else if (num1 == 1){
            outPut = "One";
        } else if (num1 == 2){
            outPut = "Two";
        } else if (num1 == 3){
            outPut = "Three";
        } else if (num1 == 4){
            outPut = "Four";
        } else if (num1 == 5){
            outPut = "Five";
        } else if (num1 == 6){
            outPut = "One";
        } else if (num1 == 7){
            outPut = "Seven";
        } else if (num1 == 8){
            outPut = "Eight";
        } else if (num1 == 9){
            outPut = "Nine";
        } else {
            outPut = "Invalid";
        }

        System.out.println(outPut);
    }
}
