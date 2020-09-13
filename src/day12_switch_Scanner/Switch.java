package day12_switch_Scanner;

public class Switch {
    public static void main(String[] args) {
        switch (10){

            case 5:
                System.out.println("Five");
                break;

            case 1:
                System.out.println("One");
                break;

            default: //You can put this one at any place of the switch
                System.out.println("Invalid case");
                break;
        }

        //Other way is using a variable and ask for the variable
        /*break; means end of the switch or exit the switch
        * It is not mandatory to use break, but it is going to execute the next available code
        * fragment until it finds a break or }
        */
    }
}
