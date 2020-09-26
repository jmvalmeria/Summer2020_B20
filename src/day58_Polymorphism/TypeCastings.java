package day58_Polymorphism;


import day57_Polymorphism.PhoneTasks.Phone;
import day57_Polymorphism.PhoneTasks.Samsung;
import day57_Polymorphism.PhoneTasks.iPhone;
import day58_Polymorphism.AnimalTask.*;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",2,'F');


        Animal animal = dog1; //done implicitly
        Animal animal2 = cat1; //converting sub type to super type, implicitly

        System.out.println("==================================================");

        Animal animal3 = new Dog("A",2,'F');
        //animal3.bark();

        Dog dog2 = (Dog)animal3;
        dog2.bark();

        System.out.println("==================================================");
        iPhone phone1 = new iPhone("12",1200,"6");
        Phone phone2 = phone1; //upcasting, implicitly

        Phone phone3 = new Samsung("S20",1000,"9");
        Samsung phone4 = (Samsung) phone3; //manually, down Casting
        ((Samsung) phone3).freezing();



    }

}
