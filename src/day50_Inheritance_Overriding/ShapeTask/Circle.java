package day50_Inheritance_Overriding.ShapeTask;

public class Circle extends Shape {

    public static double PI = 3.1416;
    public double radius;
    public double diameter;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }
}
