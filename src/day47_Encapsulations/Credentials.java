package day47_Encapsulations;

public class Credentials {

    String name;
    int age;
    private String userName;
    private String password;

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
