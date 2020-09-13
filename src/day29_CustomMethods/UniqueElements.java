package day29_CustomMethods;

public class UniqueElements {
    public static void main(String[] args) {
        String[] arr = {"A", "A", "B", "C", "C"};
        uniques(arr);

        String[] arr1 = {"D", "D", "E", "F", "T"};
        uniques(arr1);
    }

    public static void uniques(String[] arr){
        for (String each : arr){ //Select "each" element of the arrays
            int count = 0; //It is important to create the variable count in here
            for (String element : arr){ //Select every "element" inside the array an compare with each
                if (each.equals(element)){
                    count++;
                }
            }
            if (count == 1){ //Check the count
                System.out.print(each + " ");
            }
        }

        System.out.println();
    }

}
