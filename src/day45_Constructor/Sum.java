package day45_Constructor;

public class Sum {

    public Sum (int a, int b){
        System.out.println("Sum is: "+(a+b));
    }

    public Sum (double a, double b){
        System.out.println("Sum is: "+(a+b));
    }

    public Sum (int a, int b, int c){
        System.out.println("Sum is: "+(a+b+c));
    }

    public Sum (double a, double b, double c){
        System.out.println("Sum is: "+(a+b+c));
    }

    public static void main(String[] args) {
        Sum sum1 = new Sum(2,5);
        Sum sum2 = new Sum(2.5,5.2);
        Sum sum3 = new Sum(2,5, 4);
        Sum sum4 = new Sum(2.5,5.2, 4.3);
    }

}
