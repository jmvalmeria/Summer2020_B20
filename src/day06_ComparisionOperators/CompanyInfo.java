package day06_ComparisionOperators;

public class CompanyInfo {
    public static void main(String[] args) {
        /*task02:
            Create a class CompanyInfo
                Declare variables:
                            companyName
                            address
                            numberOfEmployees
                            revenue
                            isTechCompany
                Print statements and describe each value:
                                Company name is Facebook
                                address is ...
                                Number of employees is 100
                                Annual revenue is 4 000 000
                                is it tech company? - true */
        String companyName = "Facebook";
        String address = "...";
        int numberOfEmployees = 100;
        int revenue = 4_000_000;
        boolean isTechCompany = true;

        System.out.println("Company name is " + companyName);
        System.out.println("address is " + address);
        System.out.println("Number of employees is " + numberOfEmployees);
        System.out.println("Annual revenue is " + revenue);
        System.out.println("Is it tech company? - " + isTechCompany);
    }
}
