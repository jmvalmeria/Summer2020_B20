package day38_CustomClass;

import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {
        //dogPark
    Dog[] dogPark = { new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

    dogPark[0].setInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
    dogPark[1].setInfo("Roko", "German Sheper", "Medium", 3, "Brown");
    dogPark[2].setInfo("Red", "Golden", "Medium",  4, "Yellow");
    dogPark[3].setInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
    dogPark[4].setInfo("Pasa", "Pitbull","large", 1, "White");

    for (int i = 0; i < dogPark.length; i++){
        dogPark[i].getInfo();
    }

        System.out.println("======================================");

    for (Dog each : dogPark){
        each.getInfo();
    }

        System.out.println("======================================");

    String food = "treats";

    for (Dog each : dogPark){
        each.eat(food);
    }

        System.out.println("======================================");

    String drink ="milk";

        for (Dog each : dogPark){
            each.drink(drink);
        }

        System.out.println("======================================");
        //Play

        for (Dog each : dogPark){
            each.play();
        }

        System.out.println("======================================");
    //Sleep
        for (Dog each : dogPark){
            each.sleep();
        }


    }
}
