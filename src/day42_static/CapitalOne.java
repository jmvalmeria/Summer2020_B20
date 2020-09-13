package day42_static;

public class CapitalOne {
    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("waqar", 'M', 2111, "Dev Lead" , 4500000);
        developers[1].setInfo("roza", 'F', 3222, "Dev", 550000);
        developers[2].setInfo("burak", 'M', 43333, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76543, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 0005, "Dev", 120000);

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan","Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1.toString());

        System.out.println("============================================");

        for (Tester each : team1.testers){
            System.out.println(each.name + " Salary: $" + each.salary);
        }

        System.out.println("============================================");

        for (Developer each : team1.developers){
            System.out.println(each.name + " Salary: $" + each.salary);
        }

        System.out.println("============================================");

        team1.removeTester(15333);
        team1.removeDeveloper(2111);
        System.out.println(team1.toString());

        System.out.println("============================================");
        Developer dev1 = new Developer();
        dev1.setInfo("luisa", 'f', 2113L, "Dev Lead" , 5000000);
        team1.addDeveloper(dev1);
        System.out.println(team1.toString());

        System.out.println("============================================");
        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};
        /*
        Print all devLopers and testers form Scrum Team
        Return Maximum team and developers team
        */
    }
}
