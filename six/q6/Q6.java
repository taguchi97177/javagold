package six.q6;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q6 {
    public static void main(String[] aaa){
//        LocalDate date = LocalDate.parse("2018/05/07", DateTimeFormatter.ofPattern("yyyy/mm/dd") );
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        LocalDate date2 = LocalDate.parse("2021/05/23", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date2);

        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());
        System.out.println(ZonedDateTime.now());

    }

}
