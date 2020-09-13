package day24_Arrays;

public class UniquesWords2ForEachLoop {
    public static void main(String[] args) {
        String[] word = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (String each : word) {
            String s = each;
            int count = 0;
            for (String eacht : word) {
                if (s.equals(eacht)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(s);
            }

        }
    }
}
