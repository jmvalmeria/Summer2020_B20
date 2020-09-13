package day11_IfStatements;

public class Task03_IsAsymbol {
    public static void main(String[] args) {
        char character1 = '0';
        boolean isACharacter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        boolean isADigit = character1 >= 48 && character1 <= 57;
        //boolean isASymbol = !isACharacter && !isADigit;

        if (isACharacter){
            System.out.println(character1 + " is a character");
        }
        else if (isADigit){
            System.out.println(character1 + " is a digit");
        }
        else {
            System.out.println(character1 + " is a Symbol");
        }
    }
}
