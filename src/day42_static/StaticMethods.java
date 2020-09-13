package day42_static;

public class StaticMethods {
    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        //System.out.println(a);//You can not call it because it referents to te object not the class the only way is to create an object
        //System.out.println(this.a);//You can not call it because it referents to te object not the class the only way is to create an object


        //You had to create the object and access through the object
        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);

        staticMethod(); //You can call a Static method through the class name
        StaticMethods.staticMethod();

        //instanceMethod(); Compile error
        //StaticMethods.instanceMethod(); Compile error
        obj.instanceMethod(); //You can call it through the object

    }

    public static void staticMethod(){

    }

    public void instanceMethod(){

    }


}
