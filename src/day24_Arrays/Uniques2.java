package day24_Arrays;

public class Uniques2 {
    public static void main(String[] args) {
        String str = "aabcc";
        String unique = "";
        int count = 0;

        for (int j = 0; j < str.length(); j++){
            char ch1 = str.charAt(j);

            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if (ch1 == ch){
                    count += 1;
                }

            }

            if (count == 1){
                unique += ch1;
            }

        }

        System.out.println(unique);


    }
}
