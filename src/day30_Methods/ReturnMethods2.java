package day30_Methods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "level";

        String reversedName = revStr2(name);
        System.out.println(name.equals(reversedName));

    }

    public static void revStr1(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String revStr2(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
