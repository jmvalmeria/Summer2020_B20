package day46_ConstructorCalls;

public class ConstructorCall2 {

    public ConstructorCall2(){
        System.out.println("A");
    }

    public ConstructorCall2(int a){
        //ConstructorCalls2(); Do not compile
        this(); //Calling default constructor
        System.out.println("B");
    }

    public ConstructorCall2(String str){
        this(4); //AB calling the 2nd constructor
        System.out.println("C");
    }

    public ConstructorCall2(double a){
        System.out.println("E");
        //this(10);
    }

    public static void main(String[] args) {
        new ConstructorCall2(10);
    }

}
