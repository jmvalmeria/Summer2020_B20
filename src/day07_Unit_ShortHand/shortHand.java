package day07_Unit_ShortHand;

public class shortHand {
    public static void main(String[] args) {
        int a = 100;
        // a *= a;
        // a += 10;
        // a -= 10;
        // a /= 4;
        a %= 3;
        System.out.println(a);

        String firstname = "Jesús";
        String lastname = "Martínez Valero";

        firstname += " Martinez Valero";

        System.out.println(firstname);

        String name = "Donald";
        name += " Trump";
        name += " Rodriguez";
        System.out.println(name);
    }
}
