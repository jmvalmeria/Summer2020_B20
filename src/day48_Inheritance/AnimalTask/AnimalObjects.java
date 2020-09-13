package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Medium",3, 'M',"Scottie Terrier",5.5);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println(dog1);

        Cat cat1 = new Cat("Miko","Medium",2,'M', "Angora",4.3);
        System.out.println(cat1);

    }

}
