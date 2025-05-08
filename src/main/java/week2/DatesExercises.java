package week2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesExercises {
    public static void main(String[] args) {
      //  Level 1: Getting started with LocalDate and LocalTime

        // 1. Print today's date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //2.  Print a specific date
        LocalDate ld1 = LocalDate.of(2025,12,25);
        System.out.println(ld1);

        //3. Print the year, month, and day of a given LocalDate.
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());

        //4. Print the current time
        LocalTime lt = LocalTime.now();

        // 5. Create a specific time
        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt);

        // 6.Print parts of a time
        System.out.println(lt1.getHour());
        System.out.println(lt1.getMinute());

        //  Level 2: LocalDateTime and basic calculations

        //7. Create a LocalDateTime from date and time
        LocalDateTime ldt = LocalDateTime.of(ld, lt1);
        System.out.println(ldt);

        //9.Add 1 week to today’s date
        System.out.println(ld.plusWeeks(1));

        //10.Subtract 3 days from a specific date
        System.out.println(ld.minusDays(3));

        //11.Add 2 hours and 15 minutes to a LocalTime
        System.out.println(lt.plusHours(2).plusMinutes(15));

        //12. Calculate tomorrow's datetime
       LocalDateTime ldt1 = LocalDateTime.now().plusDays(1);
        System.out.println(ldt1);


        //Level 3: Parsing and formatting

        // 13. Parse a date from a string (yyyy-MM-dd)
        // create a string
        String date = "2025-04-01";

        //create the formula using LocalDateTime
        LocalDateTime ldt2 =LocalDateTime.parse(date);
        System.out.println(ldt2);












    }
}
