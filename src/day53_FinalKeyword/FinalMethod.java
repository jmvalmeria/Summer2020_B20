package day53_FinalKeyword;


class A{
    public final void method1(){
        System.out.println("Enter username and password");
    }

    private final void method1(int a){

    }

    public final static void method2(){

    }

}

public class FinalMethod extends A {

    /*
    @Override //If it compile it means that I overriding the method good
    public void method1(){ //If the method is final you cannot change the implementation
        System.out.println("Enter something else");
    }
     */

    public final static void main(String[] args) { //Main method can be final
        System.out.println("Hello wold");
    }


}
