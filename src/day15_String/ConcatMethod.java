package day15_String;

import java.util.Scanner;

public class ConcatMethod {
    public static void main(String[] args) {
        stringConcatMethod();
    }

    private static void stringConcatMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();     // "Cybertek"

        System.out.println("Enter your last name");
        String lastName = scan.next();      // "School"

        //  String fullName = firstName.concat( " ".concat(lastName)  ); // "CybertekSchool"
        String fullName = firstName + " " + lastName;


        //  System.out.println( "Your full name is: ".concat(fullName) );
        System.out.println("Your full name is: " + fullName);


    }
}
