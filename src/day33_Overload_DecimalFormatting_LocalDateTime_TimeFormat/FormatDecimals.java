package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.text.DecimalFormat;

public class FormatDecimals {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double a = 22/7.0;

        System.out.println(df.format(a)); //first call the variable and aplay the method .format(); inside (), our variable


        //6.678543222222
        System.out.println(df.format(6.678543222222));

        //12
        System.out.println(df.format(12));


    }

}
