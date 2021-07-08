package day27_Recap;

import java.util.Arrays;

public class _1ArraysUtility {
    /*
    sort():
    toString():
    equals():
     */

    public static void main(String[] args) {

        String[] names = {"Odina", "Liliia", "Berk", "Emine"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));     // ["Berk", "Emine", "Liliia", "Odina"]

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));     // [45, 56, 65, 75, 78, 80, 90, 110 ]

        System.out.println("Maximum: " + score[score.length - 1]);
        System.out.println("Minimum: " + score[0]);

        System.out.println("=======================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(Arrays.equals(s1, s2));      // true

        String[] s3 = {"C", "A", "B"};
        System.out.println(Arrays.equals(s1, s3));      // false


        String[] a1 = {"A", "C", "B"};
        String[] a2 = {"B", "A", "C"};

        Arrays.sort(a1);                                // [A, B, C]
        Arrays.sort(a2);                                // [A, B, C]

        System.out.println(Arrays.equals(a1, a2));      // true

        String w1 = Arrays.toString(a1);
        System.out.println(w1);                         // [A, B, C]


    }


}
