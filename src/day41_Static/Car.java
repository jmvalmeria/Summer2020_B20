package day41_Static;

import java.text.DecimalFormat;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    String color;

    public void setCarInfo(String brand, String model, int year, double price, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return year+" "+brand+" "+model+", "+color+", $"+df.format(price);
    }
}
