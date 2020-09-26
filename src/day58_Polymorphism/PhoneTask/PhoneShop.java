package day58_Polymorphism.PhoneTask;

import day57_Polymorphism.PhoneTasks.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {

        Phone[] phone = {
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),
                new Samsung("S20", 1100, "7"),
                new Samsung("S20", 1100, "7"),
                new iPhone("12",1000,"6.1"),
                new Samsung("S20", 1100, "7"),

        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));

        int countIphone = 0;
        int countSamSung = 0;
        int countHuaWei = 0;

        for (int i = 0; i < phoneShop.size(); i++){
            Phone each = phoneShop.get(i); //get each objects from array
            if (each instanceof iPhone){ //Checks if the object is Iphone
                countIphone++;
            } else if(each instanceof Samsung){ //Checks if the phone is Samsung
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }

        /*for (Phone each : phoneShop){
            if (each instanceof iPhone){
                countIphone++;
            } else if(each instanceof Samsung){
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }*/

        System.out.println("iPhone: " + countIphone + "\nSamsung: " + countSamSung + "\nHuawei: " + countHuaWei);

    }

}
