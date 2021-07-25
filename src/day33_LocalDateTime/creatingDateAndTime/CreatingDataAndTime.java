package day33_LocalDateTime.creatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;

public class CreatingDataAndTime {
    /*
    Time and Date is immutable
     */
    public static void main(String[] args) {
        LocalDate myBirthDay = LocalDate.of(1977, 1, 1);
        LocalDate arasBirthDay = LocalDate.of(2014, Month.SEPTEMBER, 13);
        LocalTime arasBirthTime=LocalTime.of(6,34);
        LocalDate currentDay = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime ldt1=LocalDateTime.now();
        LocalDateTime ldt2=LocalDateTime.of(arasBirthDay,arasBirthTime);
    }
}
