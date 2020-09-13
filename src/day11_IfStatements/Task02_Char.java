package day11_IfStatements;

public class Task02_Char {
    public static void main(String[] args) {
        /*write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"*/

        char character1 = 'a', character2 = 'b';
        boolean charIsEqual = character1 == character2;

        if (charIsEqual){
            System.out.println(character1 + " & " + character2 +" are the same characters");
        }else {
            System.out.println(character1 + " & " + character2 +" are NOT the same characters");
        }
    }
}
