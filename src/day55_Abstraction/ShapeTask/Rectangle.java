package day55_Abstraction.ShapeTask;

/*3. create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods

            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
*/

public class Rectangle extends Shape {
    public double width;
    public double length;

    static { //This initialize the Shape Static Variables
        name = "Rectangle";
        hasVolume = false;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
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

}
