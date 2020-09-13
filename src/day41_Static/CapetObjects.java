package day41_Static;

import java.util.ArrayList;

public class CapetObjects {
    /*create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets*/
    public static void main(String[] args) {
        Carpet[] carpets= {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5,3.5,17.5,false);
        carpets[1].customOrder(5.5,3.5,18.5,true);
        carpets[2].customOrder(4.5,5.5,19.5,false);
        carpets[3].customOrder(3.5,4.5,20.5,true);
        carpets[4].customOrder(6.5,5.5,21.5,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for(Carpet each : carpets){
            if (each.isPersian == true){
                persianCarpets.add(each);
            } else {
                regularCarpets.add(each);
            }
        }

        System.out.println("Number of persians carpets: " + persianCarpets.size());
        System.out.println("===========================");
        System.out.println("Number of regular carpets: " + regularCarpets.size());


        /*for(Carpet each : carpets){
            each.getCarpetInfo();
        }*/
    }

}
