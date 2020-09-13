package day38_CustomClass;

public class DogObjetcs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dog2.setInfo("Winston", "Scotties Terrier", "Small", 1, "Black");
        dog3.setInfo("Hannibal", "Minipilcher", "Small", 2, "Black");

        System.out.println("======================================");
        dog1.eat("Kelle Paca");
        dog3.eat("Polo");
        dog2.eat("Steak");

        System.out.println("======================================");
        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("Red-Bull");

        System.out.println("======================================");
        dog1.sleep();
        dog2.sleep();
        dog3.sleep();
    }
}
