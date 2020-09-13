package day06_ComparisionOperators;

public class oddOrEven {
    public static void main(String[] args) {
        int num = 100;
        boolean even = num%2 == 0;
        boolean odd = num%2 != 0;

        System.out.println("The number is even: " + even);
        System.out.println("The number is odd: " + odd);
    }
}
