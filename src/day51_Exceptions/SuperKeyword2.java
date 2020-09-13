package day51_Exceptions;

class B{
    public B(){
        System.out.println("Super class' default constructor");
    }
}


public class SuperKeyword2 extends B {
    public SuperKeyword2(){
        super(); //Call the supe class' constructor internally done
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();
    }

}
