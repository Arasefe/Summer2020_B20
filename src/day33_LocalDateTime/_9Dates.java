package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class _9Dates {

    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(2020, 7, 24);
        System.out.println(DOB);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDate y = LocalDate.of(2019, 1, 1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println(result2);

        System.out.println("Enter birth year, birth month, birth day");

        LocalDate d = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println(d);
        System.out.println(d.isLeapYear());


    }

}
