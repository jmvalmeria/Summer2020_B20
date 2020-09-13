package day10_Conditionals;

public class Minimum {
    public static void main(String[] args) {
        double a = 20;
        double b = 100;
        double c = 500;

        boolean aIsMinimum = a < b && a < c;
        boolean bIsMinimum = !aIsMinimum && b < c;
        boolean cIsMinimum = !aIsMinimum && !bIsMinimum;

        double min = 0;

        if (aIsMinimum){
            min = a;
        }
        if (bIsMinimum){
            min = b;
        }
        if (cIsMinimum){
            min = c;
        }

        System.out.println(min + " is the minimum number");
    }
}
