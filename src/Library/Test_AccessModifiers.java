package Library;

import day47_Encapsulations.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();;

        //default cannot call out of the packet
        //System.out.println(AccessModifiers.defaultVariable); //default is not visible outside the packet
        //AccessModifiers.defaultMethod();

        //Private
        //System.out.println(AccessModifiers.privateVariable); //private is not visible outside the class
        //AccessModifiers.privateMethod();

    }

}
