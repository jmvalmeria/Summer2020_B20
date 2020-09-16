package day54_Abstaction.ShapeTask;

import java.text.DecimalFormat;

public class Square extends Shape {

    public double side;
    DecimalFormat df = new DecimalFormat("0.00");

    public Square(double side){
        this.side = side;
    }

    public void area(){
        System.out.println("The square are is: " + df.format(side*side));
    }

}
