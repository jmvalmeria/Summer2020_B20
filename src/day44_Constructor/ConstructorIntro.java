package day44_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr){ //No argument constructor without arguments
        System.out.println("Hello " + arr);
        System.out.println("How are you? "+arr);
    }

    public static void main(String[] args) {

        ConstructorIntro obj = new ConstructorIntro("Jesús");
        ConstructorIntro obj1 = new ConstructorIntro("Marianna");
        ConstructorIntro obj2 = new ConstructorIntro("Marissa");

    }

}
