package day48_Inheritance.AnimalTask;

public class Dog extends Animal{
    //Dog became a child (Sub Class) class out of Animal (Super Class)
    //We have 2 variables
    //Methods 5: 3 from animal and 2 from Dog: Constructor and bark

    public Dog(String name, String size, int age, char gender, String breed, double weight){
        setInfo(name,size,age,gender,breed, weight);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }
}
