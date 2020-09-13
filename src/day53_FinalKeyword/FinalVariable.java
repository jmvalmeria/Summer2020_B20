package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A";

    final int x; //final instance variable need to be initialized right away
    final static int y; //final instance variable need to be initialized right away

    static { //You can also initialized in the static block
        y = 300;
    }

    public FinalVariable(){ //You can also initialized in the constructor
        x = 700;
    }


    public static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(2000,5,7);
        // dateOfBirth = LocalDate.of(1990,6,5); cannot be reasing

        final long ssn = 1234567;
        //ssn = 987654;

        final double PI = 3.14;
        // PI = 2.14;

        final char gender = 'M';
        // gender = 'F';

        final String birthPlace = "USA";
        // bithPlace = "England";


    }

}
