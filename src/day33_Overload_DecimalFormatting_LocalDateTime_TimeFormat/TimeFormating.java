package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*year: yy, yyyy
month: MM(number), MMM(3 letters of the month), MMMM(Hole letters Month)
days: dd(Number), E(week day name 3 letters), EEEE(Hole week day name)

hours: hh
minutes: mm
seconds: ss
am/pm: a
*/

public class TimeFormating {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, dd - MMMM - yyyy");


        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        System.out.println("====================================");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormatter));

        System.out.println("====================================");
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));

        System.out.println("====================================");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);

        System.out.println(Now.format(dtf));

    }
}
