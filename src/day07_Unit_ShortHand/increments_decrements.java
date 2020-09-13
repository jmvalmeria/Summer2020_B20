package day07_Unit_ShortHand;

public class increments_decrements {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);
    }
}
