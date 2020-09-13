package day10_Conditionals;

public class Vote {
    public static void main(String[] args) {
        int age = 19;
        boolean usCitizen = false;

        if (age >= 18 && usCitizen){
            System.out.println("Eligible to vote for Trump");
        } else {
            System.out.println("Not eligible to vote for Trump");
        }
    }
}
