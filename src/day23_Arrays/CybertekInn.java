package day23_Arrays;

import java.util.Scanner;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int typeRoom = 0, total = 0;

        while (true){
            System.out.println("Welcome to CybertekInn:\n================================\nPlease, choose your option:");
            System.out.println("1. King Bed: $120\n2. Queen Bed: $100\n3. Single Bed: $80");
            typeRoom = in.nextInt();

            switch (typeRoom){
                case 1:
                    total += 120;
                    break;

                case 2:
                    total += 100;
                    break;

                case 3:
                    total += 80;
                    break;

                default:
                    continue;
            }

        System.out.println("Do you want to reserve another room?");
        String answer = in.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid, Please re-enter");
            System.out.println("Do you want to reserve another room?");
            answer = in.next().toLowerCase();
        }

        if (answer.equals("no")){
            break;
        }

        }

        System.out.println("Your total price is: " +  total);
    }
}
