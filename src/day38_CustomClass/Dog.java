package day38_CustomClass;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;



    public void setInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    } //sets the info of the dog

    public void getInfo(){
        System.out.println("Name: " + name + ", Breed: " + breed + ", Size: " + size + ", Color: " + color + ", " + age + " years old.");
    } //return

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping... ZzZ z");
    }

    public void play(){
        System.out.println(name + " is playing...");
    }
}
