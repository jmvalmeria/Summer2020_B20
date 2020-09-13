package day08_LogicalOperators;

public class task03 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double operation1 = (num1 + num2) * 25;
        double operation2 = operation1 % 40;

        boolean compare = operation2 == 20;

        System.out.println(compare);



    }
}
