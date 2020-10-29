package day63_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPalindrome {
    /*
    * Create a method that will accept a String ArrayList and return the largest Palindrome String from it
     Assume there is no Strings with the same length and there will be at least one element
     */
    public static void main(String[] args) {
        System.out.println(largestPalindrome(new ArrayList<>(Arrays.asList("Aras","Tulpar","Baba","level"))));
    }

    public static String largestPalindrome(ArrayList<String> words) {
        String largestPalindrome = "";
        for (String word : words) {

            if (word.length() > largestPalindrome.length()) {
                if (isPalindrome(word)) {
                    largestPalindrome = word;
                }
            }

        }
        return largestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }
}
