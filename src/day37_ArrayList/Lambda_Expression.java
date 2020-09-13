package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));

        Predicate<Integer> lessThan5 = p -> p < 5;

        list.removeIf(lessThan5); //you can applay the lambda expression directly p -> p < 5

        System.out.println(list);

        System.out.println("====================================");

        Predicate<Integer> oddNumbers = p -> p % 2 != 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <=100; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println();

        numbers.removeIf(p -> p%2 != 0); //Remove if the number is Odd
        System.out.println(numbers);

        System.out.println();
        numbers.removeIf(p -> p%2 == 0); //Remove if the number is Even
        System.out.println(numbers);

        System.out.println("====================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Sumeyra", "Hasan", "Beril"));
        System.out.println(names);

        names.removeIf(p -> p.startsWith("M") && p.endsWith("y")); //It will remove the element that star with "M"
        System.out.println(names);

        System.out.println("====================================");
        /*Write a program that can remove the elements that are not unique from the Arraylist, you can not use loops*/

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8,8,9));
        nums.removeIf(p -> Collections.frequency(nums,p) != 1); //Elements that are not uniques

        System.out.println(nums);

        System.out.println("====================================");

        /*Write a program that can remove digits and letters for an Arraylist of characters*/
        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        charList.removeIf(p -> ((p >= 45 && p<=57) || (p >= 65 && p <=90) || (p >= 97 && p <=122)));
        System.out.println(charList);

        System.out.println("====================================");
        ArrayList<Character> charlist1 = new ArrayList<>();
        charlist1.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(charlist1);
        digits.removeIf(p -> !Character.isDigit(p));

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(charlist1);
        letters.removeIf(p -> !Character.isLetter(p));

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(charlist1);
        specialChar.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));

        System.out.println(digits + "\n\n" + letters + "\n\n" + specialChar);



    }
}
