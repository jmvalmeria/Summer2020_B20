package day19_forLoop;

public class Fibonacci {
    public static void main(String[] args) {
        /*1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
do not exceed four million, find the sum of the even-valued terms, find the odd-valued terms, and total of all numbers.*/
       int a = 0, b = 1, c = 0, resultEven = 0, resultOdd = 0;

        for (int i = 1; i <= 4_000_000; i++){
            c = a + b;
            a = b;
            b = c;

            if (c <= 4_000_000){

                if (c % 2 == 0){
                    resultEven += c;
                } else {
                    resultOdd += c;
                }
            } else {
                break;
            }
        }

        System.out.println("The sum of Even numbers is: " + resultEven);
        System.out.println("The sum of Odd numbers is: " + resultOdd);
        System.out.println("====================================");
        System.out.println("The sum of All numbers is: " + (resultEven + resultOdd));
    }
}
