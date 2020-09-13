package day48_Inheritance;

public class BankClients {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount("Jesus","Martínez Valero");
        client1.setBalance(35000.59);
        client1.setAccountHolder("Jesús Martínez Valero");
        client1.setAccountNumber(412339467);

        System.out.println(client1);
        System.out.println();
        client1.withdraw(212.5);
        System.out.println();
        System.out.println(client1);
        System.out.println();
        client1.deposit(525.5);
        System.out.println();
        System.out.println(client1);

    }
}
