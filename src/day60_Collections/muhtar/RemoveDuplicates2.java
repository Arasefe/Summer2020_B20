package day60_Collections.muhtar;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates2 {
    /*
        write a program that can remove duplicates from an array of String.
        at the end MUST return array

     */

    public static void main(String[] args) {
        removeDuplicates(new String[]{"Aras","Banu","Efe","Efe","Tulpar"});
    }

    public static void removeDuplicates(String [] names){
        names=new LinkedHashSet<>(Arrays.asList(names)).toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }

    public static void removeDuplicates2(String[]names){
        names=new LinkedHashSet<>(Arrays.asList(names)).toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
