package day43_Static;

public class StaticBlock {

    static { //Static block, It is the first that is going to execute even before main method
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

}
