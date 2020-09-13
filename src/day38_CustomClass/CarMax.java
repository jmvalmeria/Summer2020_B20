package day38_CustomClass;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Seat", "Ibiza", 2005, "Gray", 25_000, 12_000);
        car2.setInfo("Ford", "Fiesta", 2016, "Gray", 55_000, 7_000);
        car3.setInfo("Nissan", "Micra", 2000, "White", 90_000, 2_000);
        car4.setInfo("Citroën", "C15", 1999, "Gray", 125_000, 3_000);
        car5.setInfo("Lexus", "RX350", 2019, "Black", 1_000, 55_000);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        System.out.println();

        car1.start();
    }
}
