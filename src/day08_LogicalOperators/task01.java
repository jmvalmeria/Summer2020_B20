package day08_LogicalOperators;

public class task01 {
    public static void main(String[] args) {
        int a = 200;
        int b = - a++ + - --a * a-- % 2;

        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y -x * y + x / y;

        System.out.println(z);
    }
}
