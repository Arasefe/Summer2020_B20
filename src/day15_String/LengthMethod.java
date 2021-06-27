package day15_String;

import java.util.Scanner;

public class LengthMethod {
    /*
    1. write a program that ask user to enter sentence.
		then print out the first and last characters
     */
    static  Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        firstAndLast();


    }
    private static void firstAndLast(){
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        int lastIndexNum = sentence.length() - 1;

        System.out.println("" + sentence.charAt(0) + sentence.charAt(lastIndexNum));
        //                       "J"            +            'n' ==> Jn

    }

}
