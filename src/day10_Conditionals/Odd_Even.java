package day10_Conditionals;

public class Odd_Even {
    public static void main(String[] args) {
        int num = 101;
        boolean even = num%2 == 0;

        if (even){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
