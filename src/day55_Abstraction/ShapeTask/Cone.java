package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public final class Cone extends Shape {
    public double height;
    public double radius;
    public double slantHeight;

    public Cone(double height, double radius, double slantHeight ){
        if (height <=0 || radius <=0 || slantHeight<=0){
            throw new RuntimeException("Height, Radius or Slant Height of the Cone cannot be negative or 0");
        }
        this.height = height;
        this.radius = radius;
        this.slantHeight = slantHeight;
        name = "Cube";
        hasVolume = true;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return (Math.PI*radius*slantHeight)+(Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (Math.PI*radius*height)+(Math.PI*radius*2);
    }

    @Override
    public double calculateVolume() {
        return (Math.PI*height*Math.pow(radius,2))/3;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                ", slantHeight=" + slantHeight +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(volume) +
                '}';
    }
}
