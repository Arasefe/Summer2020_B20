package day61_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, Integer> map1=new HashMap<>();          // Random
        Map<String, Integer> map2=new TreeMap<>();          // Always sorted
        Map<String, Integer> map3=new LinkedHashMap<>();    // Retains the insertion order
        //Map<String, Integer> map4=new HashMap<>();          // Is synchronized ==>Thread safe

        map1.put("Banu",1982);
        map1.put("ismail",1992);
        map1.put("Aras",2014);
        map1.put("Tulpar",2016);
        System.out.println(map1);

        map2.put("Banu",1982);
        map2.put("Ismail",1992);
        map2.put("Aras",2014);
        map2.put("Tulpar",2016);
        System.out.println(map2);

        map3.put("Banu",1982);
        map3.put("Ismail",1992);
        map3.put("Aras",2014);
        map3.put("Tulpar",2016);
        System.out.println(map3);
    }
}
