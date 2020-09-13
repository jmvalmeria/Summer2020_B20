package day21_Loops;

public class DividingWithoutUsingDivision {
    public static void main(String[] args) {

        int numerator = 10;
        int divisor = 3;
        int count = 0;

        while (numerator >= divisor){
            numerator -= divisor;
            count++;
        }

        System.out.println("Divident: " + count + " & the reminder is: " + numerator);
    }
}
