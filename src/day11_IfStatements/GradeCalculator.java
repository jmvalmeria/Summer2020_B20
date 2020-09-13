package day11_IfStatements;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 97;
        String grade = "";

        if (score >= 90 && score <=100){
            grade = "You make an A";
        } else if (score >=80 && score <= 89){
            grade = "You make an B";
        } else if (score >= 70 && score <= 79){
            grade = "You make an C";
        } else if (score >=60 && score <= 69){
            grade = "You make an D";
        } else if (score >= 0 && score <59) {
            grade = "You make an F";
        } else {
            grade = "Invalid Score";
        }

        System.out.println(grade);
    }
}
