package day57_Polymorphism.Phone;

/*5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200*/

public final class Samsung extends Phone implements AndroidApp {

    public Samsung (String model, double price, String size){
        super("Samsung", model, price, size);
        if(price > 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot be greater than 1200");
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
