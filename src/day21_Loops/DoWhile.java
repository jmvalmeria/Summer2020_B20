package day21_Loops;

public class DoWhile {
    public static void main(String[] args) {
        boolean result = false;

        while (result){
            System.out.println("Hello world");
        }

        System.out.println("===============================================");

        do{ //just do it and check later
            System.out.println("Hello World");
        }while (result);

        System.out.println("===============================================");
        int num = 1;

        do{
            System.out.print(num + " ");
            num++;
        }while (num <= 20);

        System.out.println("\n===============================================");

        char ch = 'Z';
        do{
            System.out.print(ch + " ");
            ch--;
        }while (ch >= 'A');

    }
}
