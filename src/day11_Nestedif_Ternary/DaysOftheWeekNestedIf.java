package day11_Nestedif_Ternary;

public class DaysOftheWeekNestedIf {
    public static void main(String[] args) {
        int day = 3;
        String result = " ";

        if (day >=1 && day <=7){

            String isDay = (day == 1) ? "Monday" :
                           (day == 2) ? "Tuesday" :
                           (day == 3) ? "Wednesday" :
                           (day == 4) ? "Thursday" :
                           (day == 5) ? "Friday" :
                           (day == 6) ? " Saturday" :
                           "Sunday";
            System.out.println(isDay);
        }else {
            System.out.println("There is no such a day");
        }

    }
}
