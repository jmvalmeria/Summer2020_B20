package day56_Abstraction_Interface.ShapeTask;

import java.text.DecimalFormat;

public final class Cylinder extends ShapeAbs implements Volume {
    public double radius;
    public double height;

    public Cylinder(double radius,double height){
        if (radius <=0 || height <=0){
            throw new RuntimeException("Radius or Height of the cylinder cannot be negative or 0");
        }
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return (2*Math.PI*Math.pow(radius,2))+(2*Math.PI*radius*height);
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(calculateVolume()) +
                '}';
    }
}
