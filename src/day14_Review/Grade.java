package day14_Review;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        /*1. write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
*/

        Scanner in = new Scanner(System.in);

        String result = " ";

        System.out.println("Please, type the grade: ");
        double grade = in.nextDouble();


        if (grade >= 0 && grade <=100){
            if (grade >= 90){
                result = "Excellent";
            } else if (grade >= 80){
                result = "Great";
            } else if (grade >= 70){
                result = "Good";
            } else if (grade >= 60){
                result = "Passed";
            } else {
                result = "Failed";
            }

        }else {
            result = "Invalid Entry";
        }

        System.out.println(result);

    }
}
