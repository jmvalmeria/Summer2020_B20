package day43_Static;

import day42_static.Tester;

public class staticBlock2 {

    static int a;
    static String b;
    static Tester tester1 = new Tester();
    //static ExcelSheet excel;


    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Muhtar",'M', 123, "SDET", 10000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }



}
