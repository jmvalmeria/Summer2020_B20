package day12_switch_Scanner;

public class switch_practice2 {

    public static void main(String[] args) {

        String productName = "iphone";

        switch (productName){

            case "galaxy":
                System.out.println("Samsung");
                break;

            case "iphone": //Applying back to back
            case "ipad":
            case "MacBook":
                System.out.println("Apple");
                break;
        }
    }
}
