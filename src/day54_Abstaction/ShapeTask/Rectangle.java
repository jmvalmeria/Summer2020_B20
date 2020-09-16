package day54_Abstaction.ShapeTask;

import java.text.DecimalFormat;

public class Rectangle extends Shape {

    public double sideA;
    public double sideB;
    DecimalFormat df = new DecimalFormat("0.00");

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void area(){
        System.out.println("The rectangle area is: " + df.format(sideA*sideB));
    }

}
