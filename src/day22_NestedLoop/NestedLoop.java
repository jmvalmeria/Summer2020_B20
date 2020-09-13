package day22_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<= 5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n================================");

        for (int k = 1; k <= 10; k++){
            for (int n = 1; n <= 5; n++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n================================");

        for (int t = 1; t <= 7; t++){
            for (int z = 1; z <= t; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n================================");


        for (int h = 7; h >= 1; h--){
            for (int g = h; g >= 1; g--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
