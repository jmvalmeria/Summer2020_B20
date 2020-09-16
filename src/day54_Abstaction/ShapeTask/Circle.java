package day54_Abstaction.ShapeTask;

import java.text.DecimalFormat;

public class Circle extends Shape {

    public double radius;
    DecimalFormat df = new DecimalFormat("0.00");

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("The circle area is: " + df.format(radius*radius*Math.PI));
    }
}
