package day06_ComparisionOperators;

public class Swap1 {

    public static void main(String[] args) {
        /*task03:
            create a class called Swap, and write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10
         */
        int a= 10;
        int b= 15;

        System.out.println(a + 5);
        System.out.println(b - 5);

        a = a + b;
        b = a - b;
        System.out.println(b);

        a = a - b;
        System.out.println(a);


    }
}
