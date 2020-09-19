package day56_Abstraction_Interface.Phone;

public final class Samsung extends Phone {
    public Samsung(String model, double price, String size){
        super("Samsung", model, price, size);
        if (price <= 0 || price > 1200){
            throw new RuntimeException("Invalid Price: " + price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling to " + phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to" + phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public void freezing(){
        System.out.println("Samsung is freeing");
    }
}
