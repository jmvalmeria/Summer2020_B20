package day30_Methods;

public class ReturnMethods {
    public static void main(String[] args) {
        addition1(3,4);

        addition2(10,20);
        int sum = addition2(10,20);
        System.out.println(addition2(10,20) * 2);
    }

    public static void addition1(int a, int b){ //void only allows to print the result
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b){
        int sum = a+b;
        return sum;
    }
}
