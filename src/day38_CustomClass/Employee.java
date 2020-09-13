package day38_CustomClass;

public class Employee {
    String name;
    char gender;
    long SSN;
    String jobTitle;
    double salary;

    public void setEmployeeName(String employeeName, char employeeGender, long employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: " + name + ", Gender: " + gender + ", JobTitle: " + jobTitle + ", Salary: " + salary);
        String ssn = ""+SSN;
        System.out.println("SSN: " + ssn.substring(ssn.length()-4));
    }
}
