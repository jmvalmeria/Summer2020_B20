package day25_PracticeArrays;

public class shortStringUsingForEachLoop {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};

        int minLength = arr[0].length(); //3

        for(String each  : arr ){  // to find out the minimum lenght of the string in arr
            if(each.length() < minLength){
                minLength = each.length();
            }
        }


        for(String each  : arr){  // to see how many strings' lengths in the array is matching with minLength
            if(each.length() == minLength ){
                System.out.println(each);
            }
        }
    }
}
