package day62;

import java.time.LocalDate;
import java.util.*;

public class IteratingMap {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(1999, 8, 9));
        map.put("Aaron", LocalDate.of(1998, 5, 9));
        map.put("Daniel", LocalDate.of(1997, 4, 9));
        map.put("James", LocalDate.of(1996, 2, 9));
        map.put("Caleb", LocalDate.of(1995, 3, 9));
        map.put("Erik", LocalDate.of(1989, 1, 9));

        System.out.println(map);

        for (String each : map.keySet()) {
            System.out.println(each);
        }

        List<String> names=new ArrayList<>(map.keySet());
        System.out.println(names);
        System.out.println(names.get(1));

        System.out.println("+++++++++++++++++++++++++++++");

        for(LocalDate each:map.values()){
            System.out.println(each);
        }
        List<LocalDate>dateOfBirth= new ArrayList<>(map.values());
        System.out.println(dateOfBirth.get(1));

        System.out.println("+++++++++++++++++++++++++++++");

        // To iterate both key and value entrySet() is used
        for(Map.Entry<String,LocalDate> each: map.entrySet() ){
            System.out.println(each.getKey()+" : "+each.getValue());
        }



    }
}
