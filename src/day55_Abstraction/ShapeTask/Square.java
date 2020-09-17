package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public final class Square extends Shape {

    public double side;

    public Square(double side){
        if (side <=0){
            throw new RuntimeException("Side of the square cannot be negative or 0");
        }
        this.side = side;
        name = "Square";
        hasVolume = false;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea(){
        return side*2;
    }

    @Override
    public double calculatePerimeter(){
        return side*4;
    }

    @Override
    public double calculateVolume(){
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(volume) +
                '}';
    }
}
