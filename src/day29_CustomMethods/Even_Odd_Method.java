package day29_CustomMethods;

public class Even_Odd_Method {

    public static void main(String[] args) {
        even();
        odd();
    }

    public static void even(){
        for (int i = 2; i <= 100; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void odd(){
        for (int i = 1; i <= 100; i += 2){
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
