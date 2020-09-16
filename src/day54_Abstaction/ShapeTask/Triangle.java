package day54_Abstaction.ShapeTask;

import java.text.DecimalFormat;

public class Triangle extends Shape{

    public double base;
    public double high;
    DecimalFormat df = new DecimalFormat("0.00");

    public Triangle(double base, double high){
        this.base = base;
        this.high = high;
    }

    @Override
    public void area() {
        System.out.println("The triangle area is: " + df.format(base*high));
    }
}
