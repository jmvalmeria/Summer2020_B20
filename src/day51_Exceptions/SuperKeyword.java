package day51_Exceptions;

import day50_Inheritance_Overriding.CarTask.Tesla;

class Test{
    int a; // 200

    public void method(){
        System.out.println("Hello");
    }

    public void m(){
        this.method();
        //super.method(); Test class does not have super Class
    }
}

public class SuperKeyword extends Test{
    // a = 300;

    public void print1(){
        //System.out.println(this.a);
        System.out.println(a);  //Superkeyword' a ==> 300
    }

    public void print2(){
        System.out.println(super.a); //Test' a ==> 200
    }

    public void method2(){
        super.method(); // hello
        System.out.println("Hola");
    }

    public void method3(){
        this.method2();
        super.method();
    }

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 300;

        obj2.print1();
        obj2.print2();

        obj2.method2();
        System.out.println("==============");
        obj2.method3();

    }
}
