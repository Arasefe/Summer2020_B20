package day33_LocalDateTime.workingWithPeriod;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodChaining {
    public static void main(String[] args) {
        workingWithPeriod();
    }
    private static void workingWithPeriod(){
        LocalDate start=LocalDate.of(1977,Month.JANUARY,1);
        LocalDate end=LocalDate.of(2025,Month.JANUARY,1);
        Period period=Period.of(2,6,15);
        System.out.println(period);
        celebrateMySuccess(start,end,period);

    }

    private static void celebrateMySuccess(LocalDate start,LocalDate end, Period period){
        LocalDate upTo=start;
        int count=1;
        while(upTo.isBefore(end)){
            System.out.println("Celebrating my "+count+" two yearly success program "+upTo);
            count++;
            upTo=upTo.plus(period);
        }
    }
}
