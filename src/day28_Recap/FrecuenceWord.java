package day28_Recap;

public class FrecuenceWord {
    public static void main(String[] args) {
        /*1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour*/

        //Java is going to compare with each 4 characters
        //substring(0,4)

        String str = "javajava";
        int count = 0;
        for(int i= 0; i < str.length() -3 ; i++){
            if (str.substring(i, i + 4).contains("java")){
                count++;
            }
        }

        System.out.println("java is contained: " + count + " times");
    }
}
