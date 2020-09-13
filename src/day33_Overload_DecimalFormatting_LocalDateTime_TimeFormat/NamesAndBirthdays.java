package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.time.LocalDate;

public class NamesAndBirthdays {
    public static void main(String[] args) {
        String[] names = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa"};
        LocalDate[] birthdays = {LocalDate.of(1982,12,26),
                                 LocalDate.of(1993,11,25),
                                 LocalDate.of(1980,05,23),
                                 LocalDate.of(1990,11,28),
                                 LocalDate.of(1982,11,28)};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + " " + birthdays[i]);
        }


        System.out.println("===================================");

        for (LocalDate each : birthdays){
            if (!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }


    }
}
