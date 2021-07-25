package day29_CustomMethods;

public class _1Uniques {

    public static void main(String[] args) {
        /*
        Write a program that can print out the unique values from a String Array
        Must use ForEach Loop
         */
        String[] arr = {"A", "B", "B", "C", "D", "E", "F"};

        for (String a : arr) {          // gets each of the element
            int count = 0;
            for (String each : arr) {   // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {           // unique
                System.out.print(a + " ");
            }

        }


    }

}
