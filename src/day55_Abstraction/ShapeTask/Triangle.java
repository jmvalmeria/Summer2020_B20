package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public final class Triangle extends Shape {

    public double base;
    public double sideA;
    public double sideC;
    public double height;

    public Triangle(double base,double height,double sideA, double sideC){
        if (base <=0 || height <=0 || sideA<=0 || sideC<=0){
            throw new RuntimeException("Base, Height, SideA or SideC of the triangle cannot be negative or 0");
        }
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
        name = "Triangle";
        hasVolume = false;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return base*height;
    }

    @Override
    public double calculatePerimeter() {
        return base+sideC+sideA;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Triangle{" +
                "base=" + base +
                ", sideA=" + sideA +
                ", sideC=" + sideC +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", hasVolume=" + hasVolume +
                ", volume=" + df.format(volume) +
                '}';
    }
}
