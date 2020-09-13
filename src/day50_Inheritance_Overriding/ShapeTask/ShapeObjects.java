package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);

        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(3.5,4.1);

        System.out.println(rectangle.calculateArea());

        System.out.println(circle.calculatePerimeter());

        Square square = new Square(4.2);

        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }

}
