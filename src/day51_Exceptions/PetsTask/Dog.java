package day51_Exceptions.PetsTask;

/*2. create a sub class of Pet called Dog
                    override the instance methods:
                        eat(): dog eats Chciken
                        drink(): dog drinks water
                        sleep(): dog sleeps on the bed*/

public class Dog extends Pet {

    public Dog(String name, String breed, char gender, int age, String color){
        super(name, breed, gender, age, color);
    }

    protected void eat(){
        System.out.println(name+" is eating chicken");
    }


    protected void drink(){
        System.out.println(name+" is drinking water");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping on the bed");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
