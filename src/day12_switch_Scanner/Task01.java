package day12_switch_Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT*/

        int n1 = 10, n2 = 15, n3 = 30;

        String result = (n1 > n2 && n1 > n3) ? "n1 is bigger" :
                        (n2 > n1 && n2 > n3) ? "n2 is bigger" :
                        "n3 is bigger";

        System.out.println(result);
    }
}
