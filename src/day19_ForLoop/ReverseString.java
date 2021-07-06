package day19_ForLoop;

import java.util.Scanner;

public class ReverseString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


    }

    private static void reverseTheString(){
        System.out.println("Please enter your String to reverse: ");
        String str = scan.nextLine();               //Cyber

        //String result = ""+str.charAt( 4 ) + str.charAt(3) + str.charAt(2) + str.charAt(1) +str.charAt(0) ;

        String result = "";                         //rebyC

        for(int i = str.length()-1 ; i >= 0; i-- ){ //i: 4, 3, 2, 1, 0
            result +=  str.charAt(i);
        }

        System.out.println(result);

    }

}
