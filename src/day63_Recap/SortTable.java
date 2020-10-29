package day63_Recap;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortTable {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>();
        isSorted(set);

    }

    public static void isSorted(Set<String>set){
        /*
        compareTo
        ex: s.compareTo(s2)
        0-->Strings are equal
        positive-->s comes before s2 lexicographically
        Let's say there is a table on a web page and you sorted it.
        This table was given to you as a Set of Strings.
        Verify if the the table was sorted appropriately
         */
        ArrayList<String>list=new ArrayList<>(set.size());
        for (String s : set) {
            list.add(s);
        }


        char temp=list.get(0).charAt(0);
        for (int i = 0; i < set.size(); i++) {

                if(list.get(i+1).charAt(0)>list.get(i).charAt(0)){
            }
        }


    }



}
