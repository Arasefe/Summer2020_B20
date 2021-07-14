package day33_LocalDateTime.workingWithPeriod;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriod {
    // Period cannot be chained
    public static void main(String[] args) {

    }

    private static void workingWithPeriod(){
        LocalDate start=LocalDate.of(2015, Month.JANUARY,1);
        LocalDate end=LocalDate.of(2015,Month.JUNE,15);
        Period period=Period.ofMonths(1);       // 1 month period
        performAnimalEnrichment(start,end,period);
    }

    private static void performAnimalEnrichment(LocalDate start,LocalDate end, Period period){
        LocalDate upTo=start;
        while(upTo.isBefore(end)){
            System.out.println("WorkingWithPeriod.performAnimalEnrichment"+upTo);
            upTo=upTo.plus(period);
        }
    }
}
