package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNamesFromArrayList {
    public static void main(String[] args) {
        /*Remove all the names "Ahmed" from an ArrayList*/

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed"));

        employeeName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);

    }
}
