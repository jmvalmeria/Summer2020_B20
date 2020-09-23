package day57_.Phone;

public final class iPhone extends Phone implements AppleAppStore {

    /*4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500*/

    public iPhone(String brand, String model, double price, String size){
        super(brand, model, price, size);
        if(price > 1500){
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500");
        }
    }

    @Override
    public void downloadAppleApp() {
        System.out.println(brand + ", model: " + model + " is download an App from Apple Store");
    }

    @Override
    public void texting() {
        System.out.println(brand + ", model: " + model + " is texting");
    }

    @Override
    public void calling() {
        System.out.println(brand + ", model: " + model + " is calling");
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
