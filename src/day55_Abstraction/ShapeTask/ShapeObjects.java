package day55_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4.3);
        Rectangle rectangle1 = new Rectangle(4.7,9.5);
        Cylinder cylinder1 = new Cylinder(2.7,9.4);

        System.out.println(circle1);
        System.out.println("Circle has volume: "+Circle.hasVolume);
        System.out.println("======================");
        System.out.println(rectangle1);
        System.out.println("======================");
        System.out.println(cylinder1);

    }

}
