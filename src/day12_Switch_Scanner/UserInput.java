package day12_Switch_Scanner;

import java.util.Scanner;   // only imports scanner class from java.util

// import java.util.*;      // imports every thing from java util

public class UserInput {
    static Scanner  input = new Scanner(System.in);
    public static void main(String[] args) {
        userInput();

    }
    private static void userInput(){
        System.out.println("Enter your number");
        //  int num1 =   input.nextInt();
        //  long num2 =   input.nextLong();

        double num    = input.nextDouble();


        System.out.println("You entered: " + num );

    }


}
