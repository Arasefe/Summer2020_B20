package day61_Map.warmup;

import java.util.*;

/*
3. write a program that can remove the duplicated Integers from a List of Integer
   Do Not change the insertion order
 */
public class RemovedDuplicateInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 7));
        removeDuplicateIntegers(list);
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 7));


        removeDuplicateIntegers2(set1);
    }

    public static void removeDuplicateIntegers(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) count++;
            }
            if (count > 1) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }

    public static void removeDuplicateIntegers2(Set<Integer> list) {

        System.out.println(list);
    }
}
