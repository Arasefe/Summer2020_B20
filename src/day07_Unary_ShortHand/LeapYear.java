package day07_Unary_ShortHand;
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
 */

public class LeapYear {

    public static void main(String[] args) {

        isLeapYear(2024);

    }


    /**
     *  A year may be leap year if it is evenly divisible by 4
     *  Years that are divisible by 100 can not be leap unless also divisible by 400
     * @param year
     */
    public static void isLeapYear(int year){

        boolean isLeapYear= (year % 4==0) || (year % 100==0 & year%400==0);

        System.out.println("Year " + year + " is a leap year: " + isLeapYear); // 2021 is a leap year: false

    }

}
