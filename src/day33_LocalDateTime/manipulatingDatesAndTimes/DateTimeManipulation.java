package day33_LocalDateTime.manipulatingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeManipulation {
    public static void main(String[] args) {
        dateTimeManipulation1();
        dateTimeManipulation2();
        dateTimeManipulation2();
    }
    private static void dateTimeManipulation1(){
        LocalDate localDate=LocalDate.of(1977, Month.JANUARY,1);
        localDate=localDate.plusYears(44);
        localDate=localDate.plusMonths(6);
        localDate=localDate.plusDays(12);
        System.out.println(localDate);

        LocalDate lDate=LocalDate.of(2021,Month.JULY,13);
        lDate=lDate.minusYears(44);
        lDate=lDate.minusMonths(6);
        lDate=lDate.minusDays(12);
        System.out.println(lDate);
    }

    private static void dateTimeManipulation2(){
        LocalDateTime currentTime=LocalDateTime.now();
        currentTime=currentTime.minusYears(44);
        currentTime=currentTime.minusMonths(6);
        currentTime=currentTime.minusDays(12);
        currentTime=currentTime.minusHours(8);
        currentTime=currentTime.minusMinutes(24);
        System.out.println(currentTime);



    }
    private static void dateTimeManipulation3(){
        LocalDateTime currentTime=LocalDateTime.now();
        currentTime=currentTime.minusYears(44).minusMonths(6).minusDays(12).minusHours(8).minusMinutes(24);
        System.out.println(currentTime);
    }
}
