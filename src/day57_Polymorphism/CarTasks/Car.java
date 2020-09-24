package day57_Polymorphism.CarTasks;

public abstract class Car {
    public String brand;
    public String model;
    public int year;
    public double price;

    public Car(String brand,String model,int year,double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
