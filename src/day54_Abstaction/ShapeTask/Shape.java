package day54_Abstaction.ShapeTask;

/*Ex1:
    shape: not concerete ==> abstract
        area();
    circle:
        attributes: r
        area():
            r*r*PI
    square
        attributes: a
        area():
            a*a
    rectangle
        attributes: w, l
        area():
            w*l
    triangle
        attributes: b, h
        area():
            b*h*0.5*/

public abstract class Shape {

    public abstract void area();
}
