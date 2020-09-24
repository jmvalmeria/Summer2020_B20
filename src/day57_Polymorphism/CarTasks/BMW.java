package day57_Polymorphism.CarTasks;

public class BMW extends Car {
    public BMW(String model, int year, double price) {
        super("BMW", model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use a button to start your "+ brand +", " + model);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
