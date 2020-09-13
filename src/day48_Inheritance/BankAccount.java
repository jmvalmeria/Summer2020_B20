package day48_Inheritance;

/*WarmUp tasks:
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance*/

public class BankAccount {

    public static String bankName;
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    static {
        bankName = "Bank of America";
    }

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: $"+ amount);
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > 0 || amount <= 1000){
            System.out.println("Invalid amount!!");
            return;
        } else if (balance >= amount){
            System.out.println("Withdrawing: $"+amount);
             balance -= amount;
        } else {
            System.out.println("Not enough balance!!");
            return;
        }

    }

    public void availableBalance(){
        System.out.println("Available Balance: " + getBalance());
    }

    public String toString(){
        return bankName +
               "\n==================================================="+
               "\n"+firstName + " " + lastName +
               "\nAccount Number: "+getAccountNumber()+
               "\n==================================================="+
               "\nBalance: $"+getBalance();

    }
}
