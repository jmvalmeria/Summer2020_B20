package day59_OOPReview;

class A{ //The only access modifier can be default when we have a class inside on an other class

    private int a =100;
    int b = 200;
    protected int c = 300;
    public int d = 400;

    private void method1(){}
    void method2(){}
    protected void method3(){
        System.out.println("Hello World");
    }
    public void method4(){}

    public int getA(){
        return a;
    }


}

public class Inheritance extends A{

    @Override
    protected void method3(){
        System.out.println("Hello Cybertek");
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        //System.out.println(obj.a); //private cannot be inherited
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

        //obj.method1(); //Private cannot be inherited

        obj.method2();
        obj.method3();
        obj.method4();
    }

}
