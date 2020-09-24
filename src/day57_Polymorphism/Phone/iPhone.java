package day57_Polymorphism.Phone;

public final class iPhone extends Phone implements AppleAppStore, Downloadable {

    /*4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500*/

    public iPhone(String model, double price, String size){
        super("Iphone", model, price, size);
        if(price > 1500){
            throw new RuntimeException("Invalid Price, Iphone' price cannot be greater than 1500");
        }
    }

    @Override
    public void download() {
        System.out.println(brand + ", model: " + model + " is download an App from " + AppStoreName );
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(brand + ", model: " + model + " is texting to " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println(brand + ", model: " + model + " is calling to " + phoneNumber);
    }

    public void faceTiming(){
        System.out.println(brand + ", model: " + model + " is FaceTiming");
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
