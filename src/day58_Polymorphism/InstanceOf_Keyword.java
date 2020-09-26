package day58_Polymorphism;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Dog;
import day58_Polymorphism.AnimalTask.Cat;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10,'F');
        Animal animal2 = new Dog("Winston",4, 'M');
        Animal animal3 = new Cat("Kiko",2,'M');

        //verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal; //IS A relation ==> true
        System.out.println(r1);

        //Verify animal3 is the object of Cat Class
        boolean r2 = animal3 instanceof Cat;

        //Verify animal3 is th object of Dog Class
        boolean r3 = animal3 instanceof Dog; // There is no "IS A relation" ==> false

        boolean r4 = animal2 instanceof Animal;
        System.out.println(r4);

        System.out.println(animal1 instanceof Dog); //When there is NOT Polymorphism do NOT use this relation ship

        System.out.println("============================================================");

        Shape shape1 = new Rectangle(3,5);

        identifyShape(shape1);


    }


    public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is a circle");
        } else if(shape instanceof Cylinder){
            System.out.println("The shape is a cylinder");
        } else {
            System.out.println("The shape is a rectangle");
        }
    }


}
