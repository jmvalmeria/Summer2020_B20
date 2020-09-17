package day55_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4.3);
        Rectangle rectangle1 = new Rectangle(4.7,9.5);
        Cylinder cylinder1 = new Cylinder(2.7,9.4);
        Triangle triangle1 = new Triangle(22.2, 12.7, 5.2, 5.6);
        Square square1 = new Square(91.78);
        Cube cube1 = new Cube(11.04);
        Cone cone1 = new Cone(71.09,14.02,88.88);

        System.out.println(circle1);
        System.out.println("======================");
        System.out.println(rectangle1);
        System.out.println("======================");
        System.out.println(cylinder1);
        System.out.println("======================");
        System.out.println(triangle1);
        System.out.println("======================");
        System.out.println(square1);
        System.out.println("======================");
        System.out.println(cube1);
        System.out.println("======================");
        System.out.println(cone1);

    }

}
