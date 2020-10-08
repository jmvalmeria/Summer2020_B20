package day61_Maps;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>(); //Insertion order is random

        Map<String,Integer> map2 = new TreeMap<>(); //Insertion order always sorted

        Map<String,Integer> map3 = new LinkedHashMap<>(); //keeps the insertion order as it is

        Map<String,Integer> map4 = new Hashtable<>(); //It is synchronized, it is thread safe

    }

}
