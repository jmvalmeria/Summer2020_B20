package day49_Inheritance.ScrumTeamTask;

/*create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
*/

public class Developer extends Employee {

    public Developer(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name,age,gender,salary,ID,jobTitle);
    }

    public void coding(){
        System.out.println("Developer " +name + " is coding, while drinking a lot of coffee!");
    }

    public void fixBug(){
        System.out.println("Developer " +name + " is fixing a bug!!  :`(");
    }

}
