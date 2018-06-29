package six;
import java.time.*;
import java.time.temporal.*;

public class Q10 {
    public static void main(String[] aaa){
        LocalDate start = LocalDate.of(2016,Month.APRIL, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 10);
        Temporal ttt = ChronoUnit.DAYS.addTo(start, 50);
        System.out.println(ttt);
        System.out.println(start);
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println(days);

        System.out.println("=======================");
        LocalDateTime start2 = LocalDateTime.of(2016,Month.APRIL, 1,1,1);
        LocalDateTime end2 = LocalDateTime.of(2017, Month.APRIL, 10,1,1);

        System.out.println(Duration.between(start2, end2).toDays());
        System.out.println(Period.between(start, end).getDays());
        System.out.println("=======================");

        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(1000));
        System.out.println(Instant.ofEpochSecond(1000));
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(Instant.now().getEpochSecond());

        System.out.println("=======================");
        System.out.println(Duration.ofDays(10).toHours());
        System.out.println(Period.ofDays(1).getDays());
    }
}
