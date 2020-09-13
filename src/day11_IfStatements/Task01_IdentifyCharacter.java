package day11_IfStatements;

public class Task01_IdentifyCharacter {
    public static void main(String[] args) {
        /*1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z*/

        char character1 = '*';
        boolean isACharacter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);

        if (isACharacter){
            System.out.println(character1 + " is an Alphabetic character");
        } else{
            System.out.println(character1 + " is NOT an Alphabetic character");
        }
    }
}
