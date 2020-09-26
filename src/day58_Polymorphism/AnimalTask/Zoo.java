package day58_Polymorphism.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston",4, 'M');
        Animal dog2 = new Dog("Dama",2, 'F');
        Animal dog3 = new Dog("Dina",3, 'F');
        Animal cat1 = new Cat("Milo",3,'M');
        Animal cat2 = new Cat("Kiko",2,'M');
        Animal cat3 = new Cat("Luna",3,'M');

        dog1.eat();
        dog1.sleep();
        dog1.bark();
        System.out.println("=======================================");
        dog2.eat();
        dog2.sleep();
        //dog2.bark(); You cannot call the method because that method are not in the Reference Class
        System.out.println(dog2.age);
        System.out.println(dog2.gender);
        //System.out.println(dog2.dogName); You cannot call the variable that are not Reference class

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
