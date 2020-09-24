package day57_Polymorphism.CarTasks;

public class Tesla extends Car {
    public Tesla(String model, int year, double price) {
        super("Tesla", model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use your button to start your "+ brand +", " + model);
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
