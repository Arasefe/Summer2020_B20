package day33_LocalDateTime.formattingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateAndTime {
    public static void main(String[] args) {
        //formattingDateAndTime();
        //customFormatter();
        localizedMethods();
    }

    private static void formattingDateAndTime() {
        LocalDate date = LocalDate.of(1977, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(8, 15, 36);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }

    private static void customFormatter() {
        LocalDate date = LocalDate.of(1977, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(8, 15, 36);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(dateTime);
        String dt = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(dt);

        DateTimeFormatter sdtF = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(sdtF.format(dateTime));
        DateTimeFormatter mdtF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(mdtF.format(dateTime));
        DateTimeFormatter ldtF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ldtF.format(dateTime));
    }

    private static void localizedMethods() {
        LocalDate date = LocalDate.of(1977, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(8, 15, 36,380);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(shortDTF.format(dateTime));
        DateTimeFormatter mediumDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(mediumDTF.format(dateTime));
        DateTimeFormatter timeF = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(timeF.format(time));

    }

}
