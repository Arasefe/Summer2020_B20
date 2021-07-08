package day24_Arrays;

import java.util.Scanner;

public class UniquesCharsInString2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


    }

    private static void uniquesCharsInString() {
        String str = scan.next();
        // "aabcc"

        String uniques = ""; // "b

        for (int j = 0; j <= str.length() - 1; j++) {   // because we need the frequency of every single character
            char ch1 = str.charAt(j);                   // a a b c c
            int count = 0;                              // frequency of ch
            for (int i = 0; i <= str.length() - 1; i++) {  // used for finding the frequency of ch and assign it to count
                char each = str.charAt(i);              // a  a  b  c  c
                if (ch1 == each) {
                    count += 1;
                }
            }

            if (count == 1) {                           // if it only occurred one time
                uniques += ch1;
            }

        }

        System.out.println(uniques);

    }

}
