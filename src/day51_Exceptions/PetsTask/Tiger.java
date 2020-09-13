package day51_Exceptions.PetsTask;

public class Tiger extends Pet {

    public Tiger(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }

    protected void eat(){
        System.out.println(name+" is eating chicken");
    }


    protected void drink(){
        System.out.println(name+" is drinking water");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping in the Zoo");
    }

    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
