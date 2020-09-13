package day48_Inheritance.DeviceTask;

public class DeviceList {

    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","XLT223",588.99,"58\"",true,false,true);
        Phone phone1 = new Phone("Samsung","J5 Premium",230.55,"8.5\"",true,true,"Android");
        Laptop laptop1 = new Laptop("Toshiba","Satellite S50",569.89,"21\"",true,true,"Windows 10");

        System.out.println(tv1);
        System.out.println(phone1);
        System.out.println(laptop1);

    }

}
