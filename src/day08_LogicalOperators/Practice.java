package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        // >18 and US citizen
        String firstName = "Jesús";
        String lastName = "Martínez Valero";
        int age = 19;
        String citizenShip = "Spain";

        boolean eligibleToVote = age>=18 && citizenShip == "USA";
        System.out.println(firstName + " " + lastName + " is eligible to vote? " + eligibleToVote);


    }
}
