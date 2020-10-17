package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] friends = {"Abraham","Ramon","Jesus","Angel","Phill","Megan"};
        LocalDate[] DOBFriends = {LocalDate.of(1987,7,23),
                                  LocalDate.of(1967,9,15),
                                  LocalDate.of(1980,4,21),
                                  LocalDate.of(1977,3,12),
                                  LocalDate.of(1981,2,12),
                                  LocalDate.of(1997,6,23)};

        String[] classMates = {"Hanna","Ali","Mikri","Elmira","Marat"};
        LocalDate[] DOBClassMates = {LocalDate.of(1997,4,11),
                                     LocalDate.of(1998,6,23),
                                     LocalDate.of(1995,3,10),
                                     LocalDate.of(1998,4,20),
                                     LocalDate.of(1999,5,07)};

        String[] family = {"Marianna","Juan Carlos","Marissa","Javier","Cristina"};
        LocalDate[] DOBFamily = {LocalDate.of(1980,6,21),
                                 LocalDate.of(1977,12,8),
                                 LocalDate.of(1980,6,21),
                                 LocalDate.of(1981,2,8),
                                 LocalDate.of(1995,6,7)};

        List<Map<String, LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        System.out.println(list);

        for(int i = 0; i < friends.length; i++){ //We are storing the array data in a particular Map inside of a index 0 List
            list.get(0).put(friends[i],DOBFriends[i]);
        }

        for(int i = 0; i < classMates.length; i++){ //We are storing the array data in a particular Map inside of a index 1 List
            list.get(1).put(classMates[i],DOBClassMates[i]);
        }

        for(int i = 0; i < family.length; i++){ //We are storing the array data in a particular Map inside of a index 2 List
            list.get(2).put(family[i],DOBFamily[i]);
        }

        System.out.println(list);
    }

}
