package vol1.chap4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Simple Program to showcase how to use the LocalDate class
 * @author nlekane
 * @version 1.0 09-05-2019
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays( today - 1); // sets the date to the start of the month
        DayOfWeek weekday = date.getDayOfWeek();
        int weekdayValue = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < weekdayValue; i++) {
            System.out.print("    ");
        }
        while(date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();

        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
