package day56_Abstraction_Interface.Phone;

public final class IPhone extends Phone {

    public IPhone(String model, double price, String size){
        super("iPhone", model, price, size);
        if (price <= 0 || price > 1500){
            throw new RuntimeException("Invalid Price: " + price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to " + phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to " + phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public void notCompatible(){
        System.out.println("NOT compatible with non-Apple products");
    }

    public void faceTiming(long phoneNumber){ //Only unique for iPhone
        System.out.println("Iphone is faceTiming with "+phoneNumber);
    }

    public void faceTiming(long num1, long num2){ //Only unique for iPhone
        faceTiming(num1);
        faceTiming(num2);
    }

    @Override
    public String toString() {
        return "IPhone phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
