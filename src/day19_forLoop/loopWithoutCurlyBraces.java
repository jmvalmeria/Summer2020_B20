package day19_forLoop;

public class loopWithoutCurlyBraces {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) //It can only repeat one statement
            System.out.println("Hello");
            System.out.println("How are you?"); //It is not part of the loop
    }
}
