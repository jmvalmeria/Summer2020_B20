package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123"; //It is a String.
        int a = Integer.parseInt(str); //It is going to converting the String to a primitive int

        System.out.println(str + 1);
        System.out.println(a + 1);

        Double d1 = Double.parseDouble("7.5"); //It is going to converting the String to a primitive double
        System.out.println(d1 - 1);

        String s1 = "TRUE"; //It doesn't have case sensitive
        Boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1);

        System.out.println("=============================================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2); //Unboxing
        System.out.println(d2 - 1);

        String s3 = "FaLSe";
        boolean d3 = Boolean.valueOf(s3); //Unboxing
        System.out.println(!d3);



    }
}
