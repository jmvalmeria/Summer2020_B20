package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("East Turkistan", "Kashgar");
        countries.put("Spain", "Madrid");
        countries.put("Uzbekistan","Tashkent");
        countries.put("USA","Washington");
        countries.put("Ukranie","Kiev");
        countries.put("Azerbaijan","Karabagh");
        countries.put("Turkey","Ankara");

        //country name is contryName, Capital city is CityName

        for(String eachCountry: countries.keySet()){
            String eachCity = countries.get(eachCountry);
            System.out.println(eachCountry + "'s capital city is: " + eachCity);
        }

    }

}
