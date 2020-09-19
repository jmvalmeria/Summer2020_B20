package day56_Abstraction_Interface;

public abstract class AbstractClass_VS_Interface {
    public int a;
    protected static int b;

    public AbstractClass_VS_Interface(int a){ this.a = a;}

    public void method1(){ }

    public static void method2(){ }

    public abstract void method3();

    static { b=300; } // static block
}

interface A{
    int a = 10; // public static final, you need to initialize the variable, because it is final

    //public void method1(){ } You can not have instance method

    static void method2(){ } // public by default so you do not need to use public

    abstract void method3(); // public by default so you do NOT need to use public, abstract do NOT need body
    void method3_2(); // abstract by default so you do NOT need to use abstract
    //abstract method is the only recommendation in interface


    //public A(){ } CANNOT have constructor
    //static{ } CANNOT have static block
    //{ } CANNOT have instance method block
}
