package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

/* create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist*/

public class ScrumTeam {

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA,String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        if(testers.length==0){
            return;
        }
        this.testers.addAll(Arrays.asList(testers)); //This part is the harder part--> with this. you call the local variable instead instance variable
    }

    public void removeTester(long employeeID){
        testers.removeIf(p -> p.employeeID == employeeID); //The second employeeID is the local parameter
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        if(developers.length==0){
            return;
        }
        this.developers.addAll(Arrays.asList(developers)); //This part is the harder part--> with this. you call the local variable instead instance variable
    }

    public void removeDeveloper(long employeeID){
        developers.removeIf(p -> p.employeeID == employeeID); //The second employeeID is the local parameter
    }

    public String toString(){
        return testers.size()+" testers, "+ developers.size()+" developers, PO: "+PO+", BA:"+BA+", SM: "+SM;
    }

}
