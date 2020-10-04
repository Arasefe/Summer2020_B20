package day60_Collections.selfPrep;

import java.util.*;

public class ListIterator_Vector {
    public static void main(String[] args) {
        listIterator();
    }

    public static void listIterator(){
        /*
        Vector uses a dynamic array to store the data elements.
        It is similar to ArrayList.
        However, It is synchronized and contains many methods that are not the part of Collection framework.
        Since JDK 1.0
         */

        List<Integer> vector = new Vector<>();       // get, add, remove, set, removeAll, contains, size...
        vector.addAll(Arrays.asList(1,2,3,4,5));
        vector.addAll(Arrays.asList(1,2,3,4,5));
        vector.add(6);
        System.out.println("Vector: "+vector);
        System.out.println(vector.get(2));

    }
}
