package day51_Exceptions;

class C{

    public C(int a){
        System.out.println("Super Class' int arg constructor");
    }

}

public class SuperKeyword3 extends C { //Sub Class has to call a constructor from super class
    public SuperKeyword3(int a){
        super(300);
        System.out.println("Sub class constructor with int arg");
    }

    public static void main(String[] args) {
        new SuperKeyword3(100);
    }
}
