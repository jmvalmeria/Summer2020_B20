package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.*;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("11",1000, "6");
        iPhone iPhone = (iPhone) phone1;

        iPhone.faceTiming();

        System.out.println("==============================================");

        Phone phone2 = new Samsung("S20",1000,"7");
        Samsung samsung1 = (Samsung)phone2;
        //((Samsung)phone2).freezing(); Other way to castdown the Phone to Samsung
        samsung1.freezing();

        System.out.println("==============================================");

        Phone phone3 = new Huawei("Spy",1000,"7");
        ((Huawei)phone3).stealInfo(); //If we do not cast down we will get ClassCastException



    }

}
