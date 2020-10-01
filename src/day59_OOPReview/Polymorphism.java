package day59_OOPReview;


import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        Shape shape1 = new Circle(3);
        //System.out.println(shape1.radius);

        System.out.println(((Circle)shape1).radius); //Using down casting

        //Class cast exception
        //System.out.println(((Rectangle)shape1).length);
        Rectangle r1 = new Rectangle(3,5);
        Shape shape2 = r1; //Upcasting


    }
}
