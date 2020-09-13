package day23_Arrays;

public class Array_Practice01 {
    public static void main(String[] args) {
        String[] students = {"Hanna","Marat","Elmira","Elina","Jesus"}; //Colecction data
        //       index          0       1       2        3       4

        String name1 = students [1]; //To retribe a data in the array
        System.out.println(name1);

        System.out.println("==================================================");

        int[] scores = {85,70,95,90,100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Amy"};

        /*
        System.out.println(names[0] + " : " + scores[0]);
        System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);
        System.out.println(names[4] + " : " + scores[4]);
         */

        for (int i = 0; i <= 4; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }

        System.out.println("===========================================");

        //This is the way to initialize an emty Array

        String[] classMates = new String[5];
        //This is the way to assine data to a array
        //If you have nothing assing to the Array it will be print "null"

        classMates[0] = "Fatih";
        classMates[1] = "Hazel";
        classMates[2] = "Viorel";
        classMates[3] = "Elkem";
        classMates[4] = "Ahmed";

        for (int i = 0; i <= 4; i++){ //If we do not know the length of a Array, we can get it using classMates.length() - 1;
            System.out.println(classMates[i]);
        }




    }
}
