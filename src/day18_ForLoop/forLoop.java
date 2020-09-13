package day18_ForLoop;

public class forLoop {
    public static void main(String[] args) {

        int str = 1;

        for (int i = 0; i < 10; i++){
            if (i < 9){
                System.out.print(i + 1 + ", ");
            } else {
                System.out.print(i + 1);
            }
        }

        System.out.println("\n=============================");

        //Count Down

        for (int j = 100; j >= 1; j--){
            if (j == 1){
                System.out.print(j);
            } else {
                System.out.print(j + ", ");
            }
        }
    }
}
