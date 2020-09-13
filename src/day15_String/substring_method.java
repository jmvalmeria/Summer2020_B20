package day15_String;

public class substring_method {
    public static void main(String[] args) {
        String setence = "Java is fun";
        //                012345678910
        //substring(be index, end index): The lastone is excluded
        setence = setence.substring(8,11);
        System.out.println(setence);

        System.out.println("======================================");
        String sentence2 = " I like Movies and TV Series";
        String word = sentence2.substring(8,14);
        System.out.println(word);

        System.out.println("====================================");
        String firstName = "cRISTINa";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length());

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase(); //last index + 1

        System.out.println(firstName);

    }
}
