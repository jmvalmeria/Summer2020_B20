package day57_Polymorphism.Phone;

public class phoneStore {

    public static void main(String[] args) {

        Samsung samsung1 = new Samsung ("J7 Prime", 189.99,"5.5");
        iPhone iPhone1 = new iPhone("iPhone 8",249.99,"4.7");
        Huawei huawei1 = new Huawei("Huawei P30",664.77, "6.3");

        System.out.println("Phones List in Stock:");
        System.out.println("==========================================");
        System.out.println(iPhone1);
        System.out.println("==========================================");
        System.out.println(samsung1);

        System.out.println();
        System.out.println();

        System.out.println("Testing Iphone functions:");
        System.out.println("==========================================");
        iPhone1.calling(412123456);
        iPhone1.texting(412123456);
        iPhone1.faceTiming();

        System.out.println();
        System.out.println();

        System.out.println("Testing Samsung functions:");
        System.out.println("==========================================");
        samsung1.calling(412123456);
        samsung1.texting(412123456);
        samsung1.freezing();


    }
}
