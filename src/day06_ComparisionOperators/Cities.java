package day06_ComparisionOperators;

public class Cities {
    public static void main(String[] args) {
        /*    task01:
        Create a class named Cities
                Declare 3 String variables
                    city1
                    city2
                    city3
                Assign values:
                            Tashkent
                            Kyiv
                            Moscow
            Print: use the city variables
                    From Tashkent to Kyiv is $500
                    From Moscow to Tashkent is $550
                    I have been to Tashkent, Moscow, Kyiv.*/

        String city1 = "Tashkent";
        String city2 = "Kyiv";
        String city3 = "Moscow";

        System.out.println("From " + city1 + " to " + city2 + " is $500");
        System.out.println("From " + city3 + " to " + city1 + " is $550");
        System.out.println("I have to been to " + city1 + ", " + city3 + ", " + city2 + ".");


    }
}
