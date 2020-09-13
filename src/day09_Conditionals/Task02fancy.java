package day09_Conditionals;

import java.util.Scanner;

public class Task02fancy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("Please, type the grade:");

        int grade = 0;
        while (true){
            try {
                grade = Integer.valueOf(in.next());
                if (grade > 90){
                    System.out.println("Excellent");
                    break;
                }
                if (grade >= 70 && grade <= 90){
                    System.out.println("Good");
                    break;
                }
                if (grade >= 60 && grade <= 70){
                    System.out.println("Pass");
                    break;
                }
                if(grade < 60){
                    System.out.println("Fail");
                    break;
                }

            }catch (Exception e){
                System.out.println("Please, type real grade!");
            }
        }
    }
}
