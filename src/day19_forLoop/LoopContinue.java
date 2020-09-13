package day19_forLoop;

public class LoopContinue {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'F'; ch++){
            if (ch == 'C'){
                continue; //Skip 'C' value
            }

            System.out.println(ch + " ");
        }
    }
}
