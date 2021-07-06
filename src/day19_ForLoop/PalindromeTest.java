package day19_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        palindrome1();
    }

    private static void palindrome1(){
        System.out.println("Please enter the String: ");
        String str = scan.nextLine();

        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            // reversedStr += str.charAt(i);
            reversedStr += str.substring(i, i+1);

        }

        System.out.println(reversedStr);

        System.out.println( str.equalsIgnoreCase(reversedStr) );

    }

    private static void palindrome2(){
        System.out.println("Please enter the String: ");
        String str = scan.nextLine();

        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            // reversedStr += str.charAt(i);
            reversedStr += str.charAt(i);

        }

        System.out.println(reversedStr);

        System.out.println( str.equalsIgnoreCase(reversedStr) );

    }



}
