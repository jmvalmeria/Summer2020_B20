package day04_Variables;

public class carInfo {
    public static void main(String[] args) {
        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        int mileage = 30000;
        double price = 45000;
        String color = "Red";

        System.out.println("Car Information");
        System.out.println("*************************************************************");
        System.out.println(year + " " + brand + " " + model + " " + color + ", " + mileage + " miles" +", $" + price );
        System.out.println("*************************************************************");
    }
}
