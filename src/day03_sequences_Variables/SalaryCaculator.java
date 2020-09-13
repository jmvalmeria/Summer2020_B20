package day03_sequences_Variables;

public class SalaryCaculator {

    public static void main(String[] args) {
        //salary, tax (salary - totalTax)

        double salary = 150000;
        double tax= 0.28;
        double salaryTotal = salary * tax;

        double salaryAfterTax = salary - salaryTotal;

        System.out.println(salaryAfterTax);

    }
}
