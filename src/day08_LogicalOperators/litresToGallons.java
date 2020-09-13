package day08_LogicalOperators;

import java.util.Scanner;

public class litresToGallons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Input
        System.out.println("Please, Type letter *L* to convert liters to Gallons or *G* to convert Gallons to liters:");

        //Loop initial question
            String letter = "a";
            while (true){
                try {
                    letter = String.valueOf(in.nextLine());
                    if (letter.equals("l") || letter.equals ("L") || letter.equals("*l*") || letter.equals("*L*")){
                        System.out.println();
                        System.out.println("Please, type the liters: ");

                            //Loop liters
                            double liters = 0;
                            while (true){
                                try {
                                    liters = Double.valueOf(in.next());
                                    double resultGallons = liters / 3.758;

                                    System.out.println("=================================");
                                    System.out.println(liters + "l are " +  resultGallons + " Gallons");
                                    System.out.println("=================================");
                                    break;
                                }catch (Exception e){
                                    System.out.println("Please, type a number!");
                                }
                            }//End liter loop


                        break; //Break Loop Initial Question

                    } else if (letter.equals("g") || letter.equals ("G") || letter.equals("*g*") || letter.equals("*G*")){
                        System.out.println();
                        System.out.println("Please, type the Gallons: ");

                        //Loop gallons
                        double gallons = 0;
                        while (true){
                            try {
                                gallons = Double.valueOf(in.next());
                                double resultLiters = gallons * 3.758;

                                System.out.println("=================================");
                                System.out.println(gallons + " Gallons are " +  resultLiters + "l");
                                System.out.println("=================================");
                                break;
                            }catch (Exception e){
                                System.out.println("Please, type a number!");
                            }
                        }//End Gallon loop
                        break;
                    } else {
                        System.out.println("Please, try again typing L or G!");
                        continue;
                    }

                } catch (NumberFormatException nfe) {
                    System.out.println("Please, try again typing L or G!");
                }
            }

    }
}
