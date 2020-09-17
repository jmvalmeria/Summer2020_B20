package day55_Abstraction.ShapeTask;

/*2. create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle
*/

import java.text.DecimalFormat;

public final class Circle extends Shape {
    public double radius;


    public Circle (double radius){ //This is to initialize instances variables
        if (radius <=0){
            throw new RuntimeException("Radius of the circle cannot be negative or 0");
        }
        name = "circle";
        hasVolume = false;
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(volume) +
                '}';
    }
}
