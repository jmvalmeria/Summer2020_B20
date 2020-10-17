package day62_Maps;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;

public class GarbageCollectionReview {

    public static void main(String[] args) {
        String str1 = "Cybertek";
        str1 = null;

        System.out.println(str1);

        String s1 = new String("John");
        String s2 = new String("Aaron");

        s1=s2;
        System.out.println(s1+" : "+s2);

        System.out.println("========================================");

        Circle c1 = new Circle(3);
        c1 = null;

        System.out.println(c1);

        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(2,5);

        r1 = r2;

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("========================================");
        /* In Selenium we can assing null to the driver at the end of the test. It will collect the driver into
        Garbage Collection
        driver.close();
        driver = null;
         */
    }

}
