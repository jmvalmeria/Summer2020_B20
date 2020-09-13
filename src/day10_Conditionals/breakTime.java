package day10_Conditionals;

public class breakTime {
    public static void main(String[] args) {
        boolean breakTime = false;

        if (breakTime){
            System.out.println("Yes, it is time for a break!");
        }else {
            System.out.println("No, it is not time for a break! :P");
        }

        System.out.println("==================================");
        int a = 500, b = 200, max = 0;
        String message = " is the bigger number";

        if(a > b){
            max = a;
        } else {
            max = b;
        }
        System.out.println(max + message);
    }
}
