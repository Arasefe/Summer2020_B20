package day22_NestedLoop;

import java.util.Scanner;

/*
 1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
 */
public class UpperLower {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        upperLower();

    }
    private static void upperLower(){

        System.out.println("Enter a string");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt( word.length()-1  );

        boolean start = ch1 >= 'A'  && ch1 <= 'Z';      // Upper case characters
        boolean end = ch2 >= 'a' && ch2 <= 'z';         // lower case characters

        //   System.out.println(  start && end );

//        if( start && end){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

        if((ch1>=65 && ch1<=92)&(ch2>=93&&ch2<=120)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

}
