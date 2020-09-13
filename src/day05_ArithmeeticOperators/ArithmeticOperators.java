package day05_ArithmeeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(20 + 3 - 2 + 1);
        System.out.println(20*3);
        System.out.println(2+3-1*4);

        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
    }
}
