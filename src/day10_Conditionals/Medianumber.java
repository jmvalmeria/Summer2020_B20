package day10_Conditionals;

public class Medianumber {
    public static void main(String[] args) {
        double a = 300, b = 100, c = 50;
        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > c && b < a) || (b > a && b < c);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;
        if (aIsMed){
            med = a;
        }
        if (bIsMed){
            med = b;
        }
        if (cIsMed){
            med = c;
        }
        System.out.println(med + " is the median number");
    }
}
