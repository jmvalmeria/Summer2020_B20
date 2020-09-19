package day56_Abstraction_Interface;

public interface InterfacePractice {

    int a = 200; //By default is public static and final

    public static final int b = 300;

    public  static void method1(){ //This is a test because Static methods only accept static
        System.out.println(a);
        System.out.println(b);
    }

    static void main(String[] args){ } //static method

    public default void method2(){ } //default method

    //public void method3(){ } No instances so we CANNOT have instance method

    //public InterfacePractice(){ } We CANNOT have a constructor

    public abstract void method4(); //Abstract method (You do not need to declare access modifier and keyword abstract

    void method5(); //Abstract method

    // static { } We CANNOT have static block
    // { } We CANNOT have instance block
}
