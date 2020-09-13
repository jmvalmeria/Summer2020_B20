package day48_Inheritance.DeviceTask;

/*2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
                    add a constructor that can set the fileds*/

public class TV extends Device {

    public boolean hasRemoteControl;

    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemoteControl){
        this.hasRemoteControl = hasRemoteControl;
        setInfo(brand, model, price, screenSize, hasBattery, hasMemory);
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }
}
