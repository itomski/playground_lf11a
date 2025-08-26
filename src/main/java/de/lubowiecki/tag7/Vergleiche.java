package de.lubowiecki.tag7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Vergleiche {

    public static void main(String[] args) {

        double a = 10.7;
        double b = 25.38;

        System.out.println(a - b);
        System.out.println(Double.compare(a, b));

        long a2 = 10_000_736_225L;
        long b2 = 1_000_365_000L;

        System.out.println(Long.compare(a2, b2));

        System.out.println();

        // Nicht mehr verwenden
        Date d1 = new Date(2025, 10, 15, 17, 22);
        System.out.println(d1);

        LocalDate ld = LocalDate.now(); // Fabrikmethode, die das aktuelle Datum produziert
        ld = LocalDate.of(2025, 2, 15);
        System.out.println(ld);

        LocalTime lt = LocalTime.now(); // Fabrikmethode, die di aktuelle Zeit produziert
        lt = LocalTime.of(18, 22);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        //ldt = LocalDateTime.of(ld, lt);
        ldt = LocalDateTime.of(2025,1,17,20,22);
        System.out.println(ldt);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(DATE_FMT));

        final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(lt.format(TIME_FMT));

        LocalDate start = LocalDate.now();
        LocalDate ende = LocalDate.now().plusDays(10);

        System.out.println(ende.compareTo(start));

        System.out.println("Peter".compareTo("Peter"));
    }
}
