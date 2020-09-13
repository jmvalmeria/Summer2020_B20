package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");

        String[] names = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa"};
        LocalDate[] birthdays = {LocalDate.of(1982,12,26),
                LocalDate.of(1993,11,25),
                LocalDate.of(1980,05,23),
                LocalDate.of(1990,11,28),
                LocalDate.of(1982,11,28)};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + ": " + birthdays[i].format(dtf));
        }
    }

}
