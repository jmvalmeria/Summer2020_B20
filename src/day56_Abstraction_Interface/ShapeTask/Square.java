package day56_Abstraction_Interface.ShapeTask;

import java.text.DecimalFormat;

public final class Square extends ShapeAbs {

    public double side;

    public Square(double side){
        if (side <=0){
            throw new RuntimeException("Side of the square cannot be negative or 0");
        }
        this.side = side;
        name = "Square";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }
}
