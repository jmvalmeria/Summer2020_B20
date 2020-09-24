package day57_Polymorphism.PhoneTasks;

public class phoneStore {

    public static void main(String[] args) {

        Samsung samsung1 = new Samsung ("J7 Prime", 189.99,"5.5");
        iPhone iPhone1 = new iPhone("8",249.99,"4.7");
        Huawei huawei1 = new Huawei("P30",199.99, "6.3");

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

        Phone phone1 = new iPhone("11",1200, "6");
        Phone phone2 = new Samsung("S8", 900, "6.5");
        Phone phone3 = new Huawei("P30",199.99, "6.3");

        //iPhone[] phones = {iPhone1,samsung1,Huawei};
        //Samsung[] phones = {iPhone1,samsung1,Huawei};
        //Huawei[] phones = {iPhone1,samsung1,Huawei};

        Phone[] phones = {iPhone1,samsung1,huawei1,phone1,phone2,phone3}; //It is possible because of Polymorphism
        for(Phone each : phones){
            System.out.println(each);
        }
    }
}
