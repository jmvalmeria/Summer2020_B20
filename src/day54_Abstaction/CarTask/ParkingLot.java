package day54_Abstaction.CarTask;

public class ParkingLot {

    public static void main(String[] args) {

        BMW car1 = new BMW();
        Tesla car2 = new Tesla();
        Toyota car3 = new Toyota();
        Jeep car4 = new Jeep();

        car1.start();
        car2.start();
        car3.start();
        car4.start();

    }
}
