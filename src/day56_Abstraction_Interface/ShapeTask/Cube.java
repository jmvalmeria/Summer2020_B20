package day56_Abstraction_Interface.ShapeTask;

import java.text.DecimalFormat;

public final class Cube extends ShapeAbs implements Volume {
    public double side;

    public Cube(double side){
        if (side <=0){
            throw new RuntimeException("Side of the cube cannot be negative or 0");
        }
        this.side = side;
        name = "Cube";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2)*6;
    }

    @Override
    public double calculatePerimeter() {
        return 12*side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cube{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(calculateVolume()) +
                '}';
    }
}
