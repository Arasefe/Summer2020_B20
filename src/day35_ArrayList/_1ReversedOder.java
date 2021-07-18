package day35_ArrayList;

import java.util.ArrayList;

/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
public class _1ReversedOder {

    public static void main(String[] args) {
        reverseOrderOfList();
    }

    private static void reverseOrderOfList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);                   // 0
        list.set(0,27);                 // 0
        list.add(20);                   // 1
        list.add(2, 30);    // 2
        list.add(3, 30);    // cannot skip indexes


        list.add(40);                   // 3
        list.add(50);                   // 4

        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }



    }

}
