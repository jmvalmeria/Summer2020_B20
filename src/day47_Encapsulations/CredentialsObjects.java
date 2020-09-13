package day47_Encapsulations;

public class CredentialsObjects {
    public static void main(String[] args) {
        Credentials obj1 = new Credentials("Jesus",41);
        obj1.setName("Jesus Martínez");
        obj1.setPassword("123456Ht");

        System.out.println(obj1.name +" "+ obj1.age);
        System.out.println("========================");
        System.out.println(obj1.getName());
        System.out.println(obj1.getPassword());
    }
}
