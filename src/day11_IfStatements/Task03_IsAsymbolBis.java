package day11_IfStatements;

public class Task03_IsAsymbolBis {
    public static void main(String[] args) {
        char character1 = '@';
        boolean isACharacter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        boolean isADigit = character1 >= 48 && character1 <= 57;
        //boolean isASymbol = !isACharacter && !isADigit;
        String message = "";

        if (isACharacter){
            message = character1 + " is a character";
        }
        else if (isADigit){
            message = character1 + " is a digit";
        }
        else {
            message = character1 + " is a Symbol";
        }

        System.out.println(message);
    }
}
