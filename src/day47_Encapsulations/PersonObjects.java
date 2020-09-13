package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Jesus",41,'M', LocalDate.of(1979,1,31));
        System.out.println(person1);

        person1.setSsn(987654);
        person1.setID(98);
        person1.setAddress("California");

        System.out.println("SSN: "+person1.getSsn());
        System.out.println("ID: "+person1.getID());
        System.out.println("Address: "+person1.getAddress());
    }

}
