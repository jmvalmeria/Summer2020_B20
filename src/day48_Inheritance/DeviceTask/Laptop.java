package day48_Inheritance.DeviceTask;

/*4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds*/

public class Laptop extends Device {

    public static boolean hasCPU;
    public static boolean hasKeyBoard;
    public String OS;

    static {
        hasCPU = true;
        hasKeyBoard = true;
    }

    public Laptop(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, String OS){
        setInfo(brand, model, price, screenSize, hasBattery, hasMemory);
        this.OS = OS;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }

    public void coding(){
        System.out.println(brand+" "+model+" is coding");
    }

}
