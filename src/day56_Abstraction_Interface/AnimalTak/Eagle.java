package day56_Abstraction_Interface.AnimalTak;

public class Eagle extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Eagle is drinking");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
