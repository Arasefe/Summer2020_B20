package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
1. use the LocalDate & Time get the current date and time in the following format:
			Sunday, 10:28 AM, Jul/26/2020
2. use the LocalDate & Time get the current date and time in the following format:
			SUN, 10:28 PM, Jul-26-2020
 */
public class _1CustomDateTime {

    public static void main(String[] args) {
        customFormatter1();
        customFormatter2();



    }
    private static void customFormatter1(){
        // Steps
        // 1. Create Custom formatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm, MMM/dd/yyyy");
        // 2. Find LocalDateTime and assign it to a LocalDateTime variable
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);
        // 3. Format LocalDateTime variable with custom Formatter
        System.out.println( today.format(dtf) );
    }

    private static void customFormatter2(){
        // Steps
        // 1. Create Custom formatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EE, hh:mm a, MMM-dd-yyyy");
        // 2. Find LocalDateTime and assign it to a LocalDateTime variable
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);
        // 3. Format LocalDateTime variable with custom Formatter
        System.out.println( today.format(dtf) );
    }

}
