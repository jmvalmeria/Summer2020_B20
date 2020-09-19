package day56_Abstraction_Interface.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {
        Square square = new Square(37.04);
        Rectangle rectangle = new Rectangle(32.22,47.07);
        Cylinder cylinder = new Cylinder(14.42,37.42);
        Cube cube = new Cube(52.22);

        System.out.println(square);
        System.out.println("=====================================");
        System.out.println(rectangle);
        System.out.println("=====================================");
        System.out.println(cylinder);
        System.out.println("=====================================");
        System.out.println(cube);

    }
}
