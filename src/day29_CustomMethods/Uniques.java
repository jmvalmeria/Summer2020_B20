package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        /* 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop*/

        String[] arr = {"A", "A", "B", "C", "C"};


        for (String each : arr){ //Select "each" element of the arrays

            int count = 0; //It is important to create the variable count in here

            for (String element : arr){ //Select every "element" inside the array an compare with each
                if (each.equals(element)){
                    count++;
                }

            }

            if (count == 1){ //Check the count
                System.out.println(each);
            }
        }
    }
}
