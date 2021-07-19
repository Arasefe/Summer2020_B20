package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques

            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class _3Uniques {

    public static void main(String[] args) {
        uniqueElements1();
        uniqueElements2();
    }

    private static void uniqueElements1(){
        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for (Integer element : list) {        // gets the each element from list
            int count = 0;
            for (Integer each : list) {       // finds the frequency of element
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count == 1) {                 // to verify if  element is unique
                uniques.add(element);
            }
        }


        System.out.println(uniques);

    }

    private static void uniqueElements2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1) {
                uniques.add(each);
            }
        }


        System.out.println(uniques);


    }

}
