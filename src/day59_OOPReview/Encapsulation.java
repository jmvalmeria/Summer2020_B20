package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;

    private final LocalDate published = LocalDate.of(2020,9,8); //Cannot be modified

    public int getSsn(){ //Read only
        return ssn;
    }

    public void setSsn(int ssn){ //Modify only
        this.ssn = ssn;
    }

    public LocalDate getPublished(){
        return published;
    }


}
