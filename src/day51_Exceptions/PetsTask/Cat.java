package day51_Exceptions.PetsTask;

public class Cat extends Pet {
    public Cat(String name, String breed, char gender, int age, String color){
        super(name, breed, gender, age, color);
    }

    protected void eat(){
        System.out.println(name+" is eating salmon");
    }


    protected void drink(){
        System.out.println(name+" is drinking water & milk");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping on the bed");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
