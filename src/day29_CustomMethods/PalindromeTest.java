package day29_CustomMethods;

public class PalindromeTest {
    public static void main(String[] args) {
        palindrome("Dabale arroz a la zorra el abad");
    }

    public static void palindrome(String str){
        String noSpaces = str.replaceAll(" ","");
        String reverse = "";
        boolean result = true;

        for (int i = noSpaces.length()-1; i >= 0; i--){
            reverse += noSpaces.charAt(i);
        }

        System.out.println(reverse.equalsIgnoreCase(noSpaces));
    }
}
