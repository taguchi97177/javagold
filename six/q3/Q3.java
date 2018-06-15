package six.q3;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Q3 {
    public static void main(String[] aaa){
        LocalDate date = LocalDate.of(1983, 10,31);
        LocalDate date2 = LocalDate.of(1983, Month.MARCH,31);
        System.out.println(date + "    " + date2);
        LocalDate date3 = date2.plusDays(10);
        System.out.println(date2 + "    " + date3);
        System.out.println(LocalDate.ofEpochDay(20));
        System.out.println(date.plus(20, ChronoUnit.DAYS));
        Period period = Period.ofDays(5);
        period = period.plusYears(3);
        System.out.println(date.minus(period));
    }
}
