package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {
        //Public
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        //Default
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        //Private
        //System.out.println(AccessModifiers.privateVariable); //private is not visible outside the class
        //AccessModifiers.privateMethod();

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ssn); //It is imposible to have access directly to the data
        System.out.println(obj1.getSsn());
        obj1.setSsn(7654321);

        System.out.println(obj1.getSsn());

    }

}
