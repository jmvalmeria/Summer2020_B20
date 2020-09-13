package day31_MethodsRecap;

import Library.Util;

public class WarmUpTask {
    /*warmup tasks:
    1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
    3. use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class*/

    public static void main(String[] args) {
        String str = "AAA";

        int result = frequencyChar(str,'A');
        System.out.println(result);

        String resultStr = uniques("AAAAAbCCCC");
        System.out.println(resultStr);

        String resultStr2 = frequencyOfChar("DDEFJJJ");
        System.out.println(resultStr2);
    }



    //Task01
    public static int frequencyChar(String str, char ch){
        int frequence= 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                frequence++;
            }
        }

        return frequence;
    }

    //Task02
    public static String uniques(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (frequencyChar(str,str.charAt(i)) == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }

    //Task03
    public static String frequencyOfChar(String str){
        String result = "";
        String nonDup = str;

        nonDup = Util.removeDup(nonDup);

        for (int i = 0; i < nonDup.length(); i++){
            result += "" + nonDup.charAt(i) + frequencyChar(str,nonDup.charAt(i));
        }

        return result;
    }
}
