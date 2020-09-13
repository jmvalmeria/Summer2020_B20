package day16_String;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class String_Methods {
    public static void main(String[] args) {
        //replace(old value, new value);
        String email= "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo"); //asigned the new value to the same variable
        System.out.println(email);

        System.out.println("========================================");

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java","a, C#"); //Tenemos que hacer lo que queremos sustituir único
        sentence = sentence.replace("l, Java", "l, Python");

        System.out.println(sentence);

        System.out.println("========================================");
        //replaceFirst();
        String s1 = "I like to drink tea and tea";
        s1 = s1.replaceFirst("tea", "cola");
        System.out.println(s1);

        System.out.println("========================================");
        //indexOf() Buscar el valor que buscamos de alante atrás y devuelve el index en un int

        String str1 = "Cybertek";
        int num1 = str1.indexOf('r');
        System.out.println(num1);

        System.out.println("========================================");
        //lastindexOf() Empieza buscar de atrás a alante el último caracter que pedimos y nos devuelve su valor en Int

        String str2 = "I love programing in Java, Java is fun";
        int num2 = str2.indexOf("J");
        System.out.println(num2);





    }


}
