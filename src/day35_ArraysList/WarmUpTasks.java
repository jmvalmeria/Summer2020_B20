package day35_ArraysList;

import java.util.ArrayList;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}*/

        //Task01
        ArrayList <Integer> nums = new ArrayList <>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int i = nums.size() - 1; i >= 0; i--){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        System.out.println("=================================");

        //Task02
        String str = "a1b2c3";
        int sum = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 48 && str.charAt(i)<= 57){
                sum += Integer.parseInt("" + str.charAt(i)); //Convert de Char to a Integer
            }
        }

        System.out.println(sum);

        System.out.println();
        System.out.println("=================================");


        //Task03
        ArrayList <String> combineArrList = new ArrayList<>();
        String[] arr1 = {"Aalia", "Mohammed", "Aslan", "Ernis"};
        String[] arr2 = {"Zarina", "Mee", "Irina", "Virginia", "Ali", "Dawud"};

        for (String each : arr1){
            combineArrList.add(each);
        }

        for (String each : arr2){
            combineArrList.add(each);
        }

        System.out.println(combineArrList);
    }
}
