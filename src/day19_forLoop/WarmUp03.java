package day19_forLoop;

public class WarmUp03 {
    public static void main(String[] args) {
        /*3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat
*/
        for (int i = 1; i <= 10; i++){
            if ( i == 1 || i == 10){
                System.out.println("* * * * * *");
            } else {
                System.out.println("*         *");
            }
        }

    }
}
