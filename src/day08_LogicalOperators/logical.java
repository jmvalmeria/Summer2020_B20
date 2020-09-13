package day08_LogicalOperators;

public class logical {
    public static void main(String[] args) {
        boolean r1 = 9 > 7; //true
        boolean r2 = !r1; //false

        System.out.println(r1 + " : " + r2);
        System.out.println(!false); //true
        System.out.println(!true); //false

        boolean r3 = !false == true;
        System.out.println(r3);
    }
}
