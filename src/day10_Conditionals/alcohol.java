package day10_Conditionals;

public class alcohol {
    public static void main(String[] args) {
        boolean iD = true;
        int age = 19;


        if(iD == true && age > 18 ){
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }
}
