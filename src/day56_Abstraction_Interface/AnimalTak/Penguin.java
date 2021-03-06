package day56_Abstraction_Interface.AnimalTak;

public class Penguin extends Animal implements Swimmable,Playable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Penguin is drinking");
    }

    @Override
    public void play() {
        System.out.println("Penguin is playing");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
