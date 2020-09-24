package day57_Polymorphism.CarTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DealerShip {

    public static void main(String[] args) {
        Car toyota1 = new Toyota("Venza",2020,30_465);
        Car toyota2 = new Toyota("Sienna", 2020, 31_640);
        Car toyota3 = new Toyota("Prius", 2020,24_325);
        Car bmw1 = new BMW("X5",2020,58_900);
        Car bmw2 = new BMW("M2",2020,58_900);
        Car bmw3 = new BMW("Z4",2019,49_700);
        Car tesla1 = new Tesla("Y", 2020, 49_900);
        Car tesla2 = new Tesla("S", 2020, 74_990);
        Car tesla3 = new Tesla("X", 2020, 79_990);


        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(toyota1,toyota2,toyota3,bmw1,bmw2,bmw3,tesla1,tesla2,tesla3));

        for(Car each : carList){
            System.out.println(each);
        }

    }


}
