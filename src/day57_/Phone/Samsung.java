package day57_.Phone;

/*5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200*/

public final class Samsung extends Phone implements AndroidAppStore {

    public Samsung (String brand, String model, double price, String size){
        super(brand, model, price, size);
        if(price > 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void downloadAndroidApp() {
        System.out.println(brand + ", model: " + model + " is download an App from Google Play Store");
    }

    @Override
    public void texting() {
        System.out.println(brand + ", model: " + model + " is texting");
    }

    @Override
    public void calling() {
        System.out.println(brand + ", model: " + model + " is calling");
    }

    public void freezing(){
        System.out.println(brand + ", model: " + model + " is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
