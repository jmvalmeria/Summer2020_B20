package day16_String;

public class Prueba {
    public static void main(String[] args) {
        String response = "y";

        String result = "";

        switch (response){
            case "y":
                result = "Your request is being processed";
                break;

            case "n":
                result = "Thank you anyway for your consideration";
                break;

            case "h":
                result = "Sorry, no help is currently available";
                break;

            default:
                result = "Invalid entry, please try again!";

        }

        System.out.println(result);
    }
}
