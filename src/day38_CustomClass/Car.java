package day38_CustomClass;

public class Car {
    /*
    Attributes:
        model, brand, year, color, mileage
     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    } //Sets the info of the car

    public void getInfo(){
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + ", $" + price );
    } //Get the information from setInfo

    public void start(){
        System.out.println(brand + " " + model + " is started");
    }
}
