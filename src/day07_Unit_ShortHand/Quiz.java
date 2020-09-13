package day07_Unit_ShortHand;

public class Quiz {
    public static void main(String[] args) {
        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        //iNum = fNum; //You can not assigne big number to smallers you need to casted fNum = (int)fNum;
        fNum = iNum;
        //fNum = dNum; //You can not assing, you need to casted fNum = (float)dNum

        System.out.println("Result A" + 1 +2); // Result A 12
        System.out.println("Result B" + (1) + (2)); //Result B 12
        System.out.println("5 + 2 = " + 3 + 4); // 5 + 2 = 34
        System.out.println("5 + 2 = " + (3 + 4)); // 5 + 2 = 7

    }
}
