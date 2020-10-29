package day63_Recap;

import java.util.ArrayList;

public class Duplicates {
    /*
     * Create a method will take an Integer ArrayList and remove any duplicates values.
     * Return an ArrayList of unique elements.
     */

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer>numbers){
        ArrayList<Integer>uniques=new ArrayList<>();

        for (Integer number : numbers) {
            if(!(uniques.contains(number))){
                uniques.add(number);
            }
        }
        return uniques;

    }


}
