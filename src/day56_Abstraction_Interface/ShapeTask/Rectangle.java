package day56_Abstraction_Interface.ShapeTask;

import java.text.DecimalFormat;

public final class Rectangle extends ShapeAbs {

    public double width;
    public double length;

    public Rectangle(double width, double length){
        if (width <=0 || length <=0){
            throw new RuntimeException("Width or Length of the rectangle cannot be negative or 0");
        }
        this.width = width;
        this.length = length;
        name = "Rectangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }
}
