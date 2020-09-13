package day10_Conditionals;

public class Maximun {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 200;

        //Muy interesante solo usando boolean
        boolean aIsMax = a > b && a > c;
        boolean bIsMax = !aIsMax && b > c;
        boolean cIsMax = !aIsMax && !bIsMax;
        //Hice el código de abajo pero no es necesario
       /* boolean abcAreEqual = a == b && a == c;
        boolean abAreEqualButCBigger = a == b && c > a;
        boolean acAreEqualButBBigger = a == c && b > a;
        boolean bcAreEqualButABigger = b == c && a > b; */


        double max = 0;

        if (aIsMax){
            max = a;
        }
        if (bIsMax){
            max = b;
        }
        if (cIsMax){
            max = c;
        }
        //Generé el código de abajo pero no es necesario
       /* if (acAreEqualButBBigger){
            max = b;
        }
        if (bcAreEqualButABigger){
            max = a;
        }
        if (abAreEqualButCBigger){
            max = c;
        }
        if (abcAreEqual){
            System.out.println("The 3 numbers are equal");
        } */
        System.out.println(max + " is the maximum number");
    }
}
