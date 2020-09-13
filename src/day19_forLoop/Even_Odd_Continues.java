package day19_forLoop;

public class Even_Odd_Continues {

    public static void main(String[] args) {
        /*3. print odd numbers between 1 to 50
        4. print even number between 1 to 50
        */

        System.out.println("This are the Even numbers 1 - 50: ");
        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                System.out.print(i +  " ");
            } else {
                continue;
            }
        }

        System.out.println("\n\nThis are the Odd numbers 1 - 50: ");
        for (int i = 1; i <= 50; i++){
            if (i % 2 != 0){
                System.out.print(i +  " ");
            } else {
                continue;
            }
        }
    }
}
