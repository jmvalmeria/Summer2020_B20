package day52_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) {
        //method1(); //Compile error because it is fix temporary
        method2(); //Exception was permanently handled by try&catch
        //method3();

        //Thread.sleep(4000);
    }

    public static void method1() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void method2(){
        try { //Permanent solution
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }

    public static void method3() throws InterruptedException{
        method1();
    }

}
