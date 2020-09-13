package day29_CustomMethods;

public class RemoveDuplicate {

    public static void main(String[] args) {
        removeDup("abcedeabcdabd");
    }

    public static void removeDup(String str){
        String nonDup = "";

        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }

}
