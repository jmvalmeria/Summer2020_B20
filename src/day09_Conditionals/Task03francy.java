package day09_Conditionals;

import java.util.Scanner;

public class Task03francy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("Please, type the grade:");

        int grade = 0;
        while (true){
            try {
                grade = Integer.valueOf(in.next());
                if(grade > 90 && grade<=100){
                    System.out.println("Your grade is A");
                    break;
                }
                if(grade > 80 && grade <= 90){
                    System.out.println("Your grade is B");
                    break;
                }
                if(grade > 70 && grade <= 80){
                    System.out.println("Your grade is C");
                    break;
                }
                if(grade >= 60 && grade <= 70){
                    System.out.println("Your grade is D");
                    break;
                }
                if(grade < 60){
                    System.out.println("Your grade is F");
                    break;
                }

            }catch (Exception e){
                System.out.println("Please, type real grade!");
            }
        }
    }
}
