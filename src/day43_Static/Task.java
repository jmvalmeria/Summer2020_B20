package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    /*tasks:
	create static variables:
			1. Array: 1,2,3,4,5,6,7
			2. ArrayList: 10, 20, 30, 40, 50*/

    static int[] nums = {1,2,3,4,5,6,7};
    static ArrayList<Integer> nums1 = new ArrayList<>();

    // nums1.addAll(Arrays.asList(10, 20, 30, 40, 50)); Compiler error


    static {
        nums1.addAll(Arrays.asList(10, 20, 30, 40, 50));
    }

}
