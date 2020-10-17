package day62_Maps;

public class Test {

    public static void main(String[] args) {

        //String favoriteColor = "Black";
        Color favoriteColor = Color.Green;

        System.out.println(favoriteColor);

        Browser browserName = Browser.chrome;
        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;
            case safari:
                System.out.println("Safari browser is set");
                break;
            case firefox:
                System.out.println("Firefox browser is set");
                break;
            case edge:
                System.out.println("Edge browser is set");
                break;
        }

        System.out.println("===============================================");

        WeekDays day = WeekDays.Monday;
        WeekDays day1 = WeekDays.Tuesday;
        WeekDays day2 = WeekDays.Thursday;

        Month month1 = Month.January;

        Level level1 = Level.Low;
        Level level2 = Level.Medium;
        Level level3 = Level.High;
        Level level4 = Level.ChuckNorries;

        Planets planet1 = Planets.Earth;
        Planets planet2 = Planets.Jupiter;

    }

}
