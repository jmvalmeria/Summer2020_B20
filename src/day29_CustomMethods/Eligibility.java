package day29_CustomMethods;

public class Eligibility {

    public static void main(String[] args) {
        vote( "John",28, true, "Biden");
        vote("Elisa", 12, true, "Kanye");
        System.out.println("==============================");
        buyAlcohol(true, 20);
        System.out.println("==============================");
        calculator(20,'-',30);
        System.out.println("==============================");
        grade(67);

    }

    public static void vote(String name, int age, boolean citizen, String candidate){
        boolean eligibleToVote =  age >= 18 && citizen == true;
        if (eligibleToVote){
            System.out.println(name + " is eligible to vote for " + candidate);
        } else {
            System.out.println(name + " is no eligible to vote!");
        }
    }

    public static void grade (int grade){
        String result = (grade <= 50) ? "F" : (grade > 50 && grade < 60) ? "D" : (grade >= 60 && grade <= 70) ? "C" : (grade > 70 && grade < 80) ? "B" : "A";
        System.out.println(result);
        System.out.println();
    }

    public static void buyAlcohol(boolean hasID, int age){
        boolean eligibleToByAlcohol = hasID == true && age >= 21;
        if (eligibleToByAlcohol){
            System.out.println("You are eligible to buy alcohol!");
        } else {
            System.out.println("You are eligible to buy milk!");
        }
    }

    public static void calculator(double num1, char operator, double num2){

        switch (operator){
            case '+':
                System.out.println("Addiction: " + num1+num2);
                break;
            case '-':
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: " + num1*num2);
                break;
            case '/':
                System.out.println("Division: "+ num1/num2);
                break;
            case '%':
                System.out.println("Remainder: " + num1%num2);
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
