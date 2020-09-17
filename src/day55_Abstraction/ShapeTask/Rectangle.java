package day55_Abstraction.ShapeTask;

/*3. create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods

            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
*/

import java.text.DecimalFormat;

public final class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length){
        if (width <=0 || length <=0){
            throw new RuntimeException("Width or Length of the rectangle cannot be negative or 0");
        }
        this.width = width;
        this.length = length;
        name = "Rectangle";
        hasVolume = false;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea(){
        return width*length;
    }

    @Override
    public double calculatePerimeter(){
        return (width+length)*2;
    }

    @Override
    public double calculateVolume(){
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}
