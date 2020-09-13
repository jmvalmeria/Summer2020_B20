package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {

        Cat[] catPark = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catPark[0].setInfo("Miko",4,'F',"Brown","Bengal");
        catPark[1].setInfo("Puki",3,'M',"Orange","Abyssinian");
        catPark[2].setInfo("Miaw",1,'M',"White","Persian");
        catPark[3].setInfo("Reese",2,'F',"Gray","British Shorthair");
        catPark[4].setInfo("Yoyo",3,'F',"Brown and White","Siamese");

        for (Cat each : catPark){
            System.out.println(each.toString());
        }

        System.out.println("========================================");

        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(catPark));
        maleCats.removeIf(p-> p.gender == 'F');
        System.out.println("Number of male cats: " + maleCats.size());

        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catPark));
        femaleCats.removeIf(p-> p.gender == 'M');
        System.out.println("Number of female cats: " + femaleCats.size());

        System.out.println(maleCats);
        System.out.println("========================================");
        System.out.println(femaleCats);


    }
}
