package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _2MultiplyOddNumbers {
    /*
    Write a program that can multiply all odd numbers of an ArrayList by 2
     */

    public static void main(String[] args) {
        mutiplyOddNumbers(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }

    private static void mutiplyOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> numbers = list;
        for (int i = 0; i < list.size(); i++) {
            Integer each = list.get(i);
            if (each % 2 != 0) {
                numbers.set(i, each * 2);
            }
        }
        System.out.println(numbers);
    }
}
