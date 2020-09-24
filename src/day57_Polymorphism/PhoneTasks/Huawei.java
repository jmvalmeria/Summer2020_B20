package day57_Polymorphism.PhoneTasks;

public class Huawei extends Phone implements  AndroidApp, AppleApp, Downloadable{


    public Huawei( String model, double price, String size) {
        super("Huawei", model,price,size);
        if(price > 200){
            throw new RuntimeException("No way Huawei is worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading apps from "+AndroidApp.AppStoreName+" and "+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(brand + ", model: " + model + " is texting to " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println(brand + ", model: " + model + " is calling to " + phoneNumber);
    }

    public void stealInfo(){
        System.out.println(brand + ", model: " + model + " is stealing your information");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
