package day58_Polymorphism;

import day55_Abstraction.ShapeTask.*;
import day57_Polymorphism.PhoneTasks.*;
import day58_Polymorphism.AnimalTask.*;

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

        System.out.println("============================================================");

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);

        System.out.println("equalShape(c1,c2) = " + equalShape(c1, c2));

        Rectangle re1 = new Rectangle(4,7);
        Rectangle re2 = new Rectangle(7,4);

        System.out.println("equalShape(re1,re2) = " + equalShape(re1, re2));

        Cylinder cy1 = new Cylinder(5,9);
        Cylinder cy2 = new Cylinder(9,5);
        System.out.println("equalShape(cy1,cy2) = " + equalShape(cy1, cy2));

        System.out.println("============================================================");

        Phone phone1 = new iPhone("11",1200, "6");
        Phone phone2 = new Samsung("S8", 900, "6.5");

        facetiming(phone1);
        facetiming(phone2);
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

    public static boolean equalShape(Shape shape1, Shape shape2){
        boolean result = false;
        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangle && shape2 instanceof Rectangle;
        boolean bothCylinder = shape1 instanceof Cylinder && shape2 instanceof Cylinder;

        if(bothCircle){
            if (((Circle)shape1).radius == ((Circle)shape2).radius ){
                result = true;
            }
        }

        if (bothRectangle){
            Rectangle r1 = (Rectangle)shape1;
            Rectangle r2 = (Rectangle)shape2;
            if (r1.width == r2.width && r1.length == r2.width){
                result = true;
            }
        }

        if (bothCylinder){
            Cylinder c1 = (Cylinder)shape1;
            Cylinder c2 = (Cylinder)shape2;
            if (c1.radius == c2.radius && c1.height == c2.height ){
                result = true;
            }
        }


        return result;
    }

    public static void facetiming(Phone phone){
        /*3. Create a custom method called facetiming that takes an argument of Phone,
        * if the phone is Iphone, the method prints iphone and calls the faceTiming of Iphone,
        * if the Phone is not Iphone, print "No Such function*/

        boolean isIPhone = phone instanceof iPhone;
        if (isIPhone){
            System.out.println(phone.brand + " " + phone.model + ": is calling the faceTiming of Iphone");
        }else {
            System.out.println("No Such function!!!");
            return;
        }

    }

}
