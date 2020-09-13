package day29_CustomMethods;

public class MethodsWithoutParameter2 {
    // Access-Modifier     Specifiers    return-type     name ( ){ methods }
    public static void main(String[] args) {
        loop5();
        System.out.println("Cybertek");
        loop5();
        System.out.println("Jesús");
        loop5();
    }
    public static void loop5(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Hello");
        }
    }
}
