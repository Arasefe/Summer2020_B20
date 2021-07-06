package day16_String;

import java.util.Scanner;

public class EqualWords {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        equalWords1();

    }

    private static void equalWords1(){

        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter your second word");
        String second = scan.next();

        if(first.equals(second)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal "+first+""+second);
            //System.out.println("They are not equal ".concat(first.concat(second)));
        }
    }

    private static void equalWords2(){
        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter your second word");
        String second = scan.next();
        String result = (first.equalsIgnoreCase(second)) ? "Equal" : "Not equal";

        System.out.println(result);
    }


}
