package day14_Review;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*3. write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode
            and then print out the full address
                ex:
                    input:
                            7925
                            JonesBranch
                            Dr
                            McLean
                            VA
                            22000
                    output:
                        addrees:    7925 JonesBranch Dr, McLean VA, 22000
*/

        System.out.println("Please, type your building number: ");
        int buildingNumber = 0;

        while (true){
            try{
                buildingNumber = Integer.valueOf(in.nextLine());
                if (buildingNumber <= 0){
                    System.out.println("Please, type your building number!");
                    continue;
                } else  {
                    break;
                }

            }catch (Exception e){
                System.out.println("Please, type your building number!");
            }
        }

        in.nextLine();
        System.out.println();
        System.out.println("Please, type your street name: ");
        String streetName = in.nextLine();
        in.nextLine();

        System.out.println();
        System.out.println("Please, type your road name: ");
        String roadName = in.next();

        in.nextLine();
        System.out.println();
        System.out.println("Please, type your city name: ");
        String cityName = in.nextLine();

        System.out.println();
        System.out.println("Please, type your state abbreviation: ");
        String stateAbbreciation = in.next();
    }
}
