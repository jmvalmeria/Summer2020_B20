package day57_Polymorphism.CarTasks;

public class Toyota extends Car {
    public Toyota(String model, int year, double price) {
        super("Toyota", model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use your key to start your "+ brand +", " + model);
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
