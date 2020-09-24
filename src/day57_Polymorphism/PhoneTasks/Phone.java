package day57_Polymorphism.PhoneTasks;

/*Warmup task:
    1. create an interface named AndroidAppStore
            variable: AppStoreName
            abstract method: downloadAndroidApp();

    2. create an interface named AppleAppStore
            variable: AppStoreName
            abstract method: downloadAppleApp();
    3. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()
            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
    4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
    5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200*/


public abstract class Phone {
    public String brand, model, size;
    public double price;

    public Phone(String brand, String model, double price, String size){
        this.brand = brand;
        this.model = model;
        if(price <= 0){
            throw new RuntimeException("Invalid Price, cannot be negative or zero");
        }
        this.price = price;
        this.size = size;
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

}
