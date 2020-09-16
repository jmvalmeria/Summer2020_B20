package day54_Abstaction.ShapeTask;

public class ShapeList {

    public static void main(String[] args) {

        Circle circle = new Circle(12.4);
        Square square = new Square(12.03);
        Rectangle rectangle = new Rectangle(14.17,9.02);
        Triangle triangle = new Triangle(7.03,11.4);

        circle.area();
        square.area();
        rectangle.area();
        triangle.area();

    }

}
