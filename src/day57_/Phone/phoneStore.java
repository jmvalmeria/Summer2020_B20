package day57_.Phone;

public class phoneStore {

    public static void main(String[] args) {

        Samsung samsung1 = new Samsung("Samsung","J7 Prime", 189.99,"5.5");
        iPhone iPhone1 = new iPhone("iPhone","iPhone 8",249.99,"4.7");

        System.out.println("Phones List in Stock:");
        System.out.println("==========================================");
        System.out.println(iPhone1);
        System.out.println("==========================================");
        System.out.println(samsung1);

        System.out.println();
        System.out.println();

        System.out.println("Testing Iphone functions:");
        System.out.println("==========================================");
        iPhone1.calling();
        iPhone1.texting();
        iPhone1.faceTiming();

        System.out.println();
        System.out.println();

        System.out.println("Testing Samsung functions:");
        System.out.println("==========================================");
        samsung1.calling();
        samsung1.texting();
        samsung1.freezing();


    }
}
