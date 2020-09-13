package day43_Static;

public class static_VS_instance {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {

        static_VS_instance obj1 = new static_VS_instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        static_VS_instance obj2 = new static_VS_instance();
        obj2.instanceVariable = 200;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("===============================");

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);


    }

}
