package day11_IfStatements;

public class Task02_IdentifyDigit {
    public static void main(String[] args) {
        /*2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit*/

        char num = 'a';
        boolean isADigit = num >= 48 && num <= 57;

        if (isADigit){
            System.out.println(num + " is a Digit");
        } else {
            System.out.println(num + " is NOT a Digit");
        }
    }
}
