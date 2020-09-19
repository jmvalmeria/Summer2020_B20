package day56_Abstraction.Phone;

public class PhoneList {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("iPhone 8",249.99,"4.7");
        //IPhone iPhone2 = new IPhone("iPhone 8",0,"4.7");
        Samsung samsung1 = new Samsung("j7 Prime",189.99,"5.5" );
        //Samsung samsung2 = new Samsung("j7 Prime",-10,"5.5" );

        System.out.println(iPhone1);
        System.out.println("==============================================");
        //System.out.println(iPhone2);
        System.out.println("==============================================");
        System.out.println(samsung1);
        System.out.println("==============================================");
        //System.out.println(samsung2);
    }
}
