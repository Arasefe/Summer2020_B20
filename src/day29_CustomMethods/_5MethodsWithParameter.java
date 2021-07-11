package day29_CustomMethods;

import java.util.Scanner;

public class _5MethodsWithParameter {


    public static void main(String[] args) {

        printHello(5);

        System.out.println("=======================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        /*
        int birthYear = scan.nextInt();
        int currentYear = scan.nextInt();
        */
        calculateAge(scan.nextInt(), scan.nextInt());

    }


    public static void printHello(int numberOfTimes) {

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Hello World");
        }

    }


    public static void calculateAge(int birthYear, int currentYear) {
        int age=0;
        if (currentYear < birthYear) {
            System.out.println("Invalid Entry");
        } else {
            age = currentYear - birthYear;

        }
        System.out.println("You are " + age + " years old");
    }


}
