package day35_ArraysList;

import java.io.FileOutputStream;

public class SumOfDigits2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for (char each : str.toCharArray()){
            if(Character.isDigit(each)){ //It is verify if the char is digit, return boolean. Other Method is .isLetter(); to check if a char is a letter
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);

        /*
        Character:
            .isDigit(char); It verify if the char is a digit, return a boolean
            .isLetter(char); It verify if the char is a letter, return a boolean
         */
    }
}
