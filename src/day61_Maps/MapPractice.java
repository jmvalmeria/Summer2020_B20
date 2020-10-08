package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employee = new LinkedHashMap<>();
        employee.put("Elvira",150_000.00);//it put pair of data
        employee.put("Ziiadin",120_000.00);
        employee.put("Roma",130_000.00);
        employee.put("Cihan",140_000.00);
        employee.put("Nurbiye",120_000.00);

        System.out.println(employee);
        System.out.println(employee.size());

        System.out.println("Salary of Ziiadin: $" + employee.get("Ziiadin")); //We get the value of from the key value

        employee.remove("Ziiadin"); //It removes the pair of data

        System.out.println(employee);

        boolean r1 = employee.containsKey("Roman"); //Contains verify if the key is in the list
        System.out.println("r1 = " + r1);

        boolean r2 = employee.containsValue("120_000.50");
        System.out.println("r2 = " + r2);

        boolean r3 = employee.containsValue(150_000.00);
        System.out.println("r3 = " + r3);

        employee.clear();
        System.out.println(employee);

        employee.isEmpty();
        System.out.println(employee);
    }

}
