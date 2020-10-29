package day62.warmup;

import java.util.*;

/*
2. write a program that stores the unique characters from a string into a map

        Ex:
            str = "abacbdeef";
            output:
                {c=1, d=1, f=1}

 */
public class UniqueCharacterMap {
    public static void main(String[] args) {
        uniqueCharacterMap("abacdeef");
    }

    public static void uniqueCharacterMap(String str) {
        List<String> list = Arrays.asList(str.split(""));
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : list) {
            if (Collections.frequency(list, each) == 1) {
                map.put(each, 1);
            }
        }
        System.out.println(map);

        // verify that b is unique
        System.out.println(map.containsKey("b"));

    }
}
