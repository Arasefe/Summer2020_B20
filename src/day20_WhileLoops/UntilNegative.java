package day20_WhileLoops;
/*
 1. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */

import java.util.Scanner;

public class UntilNegative {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        sumOfNumsUntilNegative();

    }

    private static void sumOfNumsUntilNegative(){

        int sum = 0;

        for (int i = 0; i < 100; ) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();


            if (num < 0) {
                break;
            }

            sum += num;


        }

        System.out.println("sum is: " + sum);


    }

}
