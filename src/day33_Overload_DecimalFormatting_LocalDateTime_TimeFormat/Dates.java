package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {
    public static void main(String[] args) {
        //LocalDate: year, month, day
        LocalDate birthday = LocalDate.of(1979,01,31);
        System.out.println(birthday);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2019,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);


        //LocalTime:
        LocalTime time = LocalTime.of(14,32,20);
        System.out.println(time);

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);


        //LocalDateTime:
        LocalDateTime t3 = LocalDateTime.of(2020,07,25,15,25);
        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);

    }
}
