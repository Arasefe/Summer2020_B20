package day60_Collections.selfPrep;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        setInterface();
    }
    public static void setInterface(){
        /*
        Set Interface in Java is present in java.util package.
        It extends the Collection interface.
        Set is implemented by HashSet, LinkedHashSet, and TreeSet.
        It represents the unordered set of elements which doesn't allow us to store the duplicate items.
        We can store at most one null value in Set.
         */

        Set<String> s1=new HashSet<String>();
        Set<String> s2=new LinkedHashSet<>();
        Set<String> s3=new TreeSet<String>();

        s1.addAll(Arrays.asList("a","b","c","a","b","c","d","e","e","e","d"));

        System.out.println(s1);

    }
}
