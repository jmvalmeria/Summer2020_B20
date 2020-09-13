package day32_Methods;

public class overloadMethod {

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 30;
        double num3 = 5;
        double num4 = 87;

        addition(num1,num2);
        addition(num1,num2,num3);
        addition(num1,num2,num3,num4);
    }


    //When we "overload" a method means that we create method with the same name and MUST have different parameters
    public static void addition(double a, double b){
        System.out.println(a+b);
    }

    public static void addition(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void addition(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }
}
