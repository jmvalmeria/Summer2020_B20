package day20_WhileLoops;

public class WhileLoop_Practice01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        int j = 1;

        while (j <= 10){
            System.out.print(j + " ");
            j++;
        }


        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        int k = 1;

        while (k <= 5){
            System.out.println("Jesus");
            k++;
        }

        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        String sentence = "Pepe paco pepe";
        int g = sentence.length() - 1;

        while (g >= 0){
            System.out.print(sentence.substring(g, g + 1));
            g--;
        }

    }
}
