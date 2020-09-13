package day44_Constructor;

public class HumanResource {

    static Employee employee1; //Create the variable, we can call from the class name
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {
        employee1 = new Employee(); //Initialize in the static block
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        //then the class need to be set
        employee1.setEmployeeInfo("Muhammed",12312,456432,"SDET",120000,'M');
        employee2.setEmployeeInfo("Erkan",45678,123987,"QA",115000,'M');
        employee3.setEmployeeInfo("Asiya",56431,657098,"Instructor",99000,'F');
        employee4.setEmployeeInfo("Ayse",17876,342567,"SDET",125000,'F');
        employee5.setEmployeeInfo("Ahmet",67543,987654,"Developer",140000,'M');
    }

}
