package day38_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
            car1.brand = "Toyota"; //We add the brand to the object/Instance Car1
            car1.color = "Corolla";
            car1.year = 2020;
            car1.color= "White";
            car1.mileage = 20000;
            car1.price = 19000.50;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("================================================");

        Car car2 = new Car();

        System.out.println(car2.brand); //It give us the default values, because they are not initialize the values
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        System.out.println("================================================");

        Car car3 = new Car();
            car3.brand = "BMW";
            car3.model = "G 550";
            car3.year = 2000;
            car3.color = "Blue";

        System.out.println(car3.brand); //It give us the default values, because they are not initialize the values
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.color);

        System.out.println("================================================");

        Car car4 = new Car();
        car4.setInfo("Mercedes", "M125", 2000, "Orange", 21_000, 7_000);

        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.year);
        System.out.println(car4.color);

        System.out.println("================================================");

        Car car5 = new Car();
        car5.setInfo("Ford", "Fiesta", 2016, "Gray", 56_000, 8_000);

        System.out.println(car5.brand);
        System.out.println(car5.model);
        System.out.println(car5.year);
        System.out.println(car5.color);

        System.out.println("================================================");

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

    }
}
