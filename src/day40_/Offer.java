package day40_;

public class Offer {
    /*
    Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword
    */

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean wFh;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean wFh, String jobTitle, boolean hasBenefit){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.wFh = wFh;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){
        System.out.println("===========================================");
        System.out.println("Salary: " + salary);
        System.out.println("State: " + state);
        System.out.println("Has it PTO?: " + hasPTO + " / " + "Is it full-time?: " + isFullTime);
        System.out.println("Can I work from home?: " + wFh);
        System.out.println("What is the Job Title?: " +  jobTitle);
        System.out.println("Does it have benefits?: " + hasBenefit);
        System.out.println("===========================================");
    }

}
