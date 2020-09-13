package day08_LogicalOperators;

public class triangles {
    public static void main(String[] args) {
        double angle1 = 40;
        double angle2 = 120;
        double angle3 = 20;
        double resultTriangle = angle1 + angle2 + angle3;

        if (resultTriangle == 180){
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is NOT a valid triangle");
        }
    }
}
