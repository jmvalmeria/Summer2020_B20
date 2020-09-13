package day42_static;

public class Circle {
    double radius;
    double diameter;
    static double pi= 3.14;

    public void sentInfo(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcCirclePerimeter(){
        return diameter*pi;
    }

    public double calcCircleArea(){
        return radius*radius*pi;
    }

    public String toString(){
        return "Circle Radius: "+radius+"\nDiameter: "+diameter+"\nCircle Perimeter: "+calcCirclePerimeter()+"\nCircle Area: "+calcCircleArea()+"\nPI: "+pi;
    }

}
