package day21_Loops;

import java.util.Scanner;

// 1. write a program that asks user to enter 5 numbers and returns the maximum number
public class MaxNumber {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        maxNumber();

    }
    private static void maxNumber(){


        int max = -2147483648;              // Min number of int

        for (int i = 10; i <= 50; i += 10) {
            System.out.println("Enter your " +i/10+" number");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number: " + max);

    }

}
