package day19_forLoop;

public class WarmUp04 {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 1; i <= 100; i++){
           result = result += i;
        }

        System.out.println(result);
    }
}
