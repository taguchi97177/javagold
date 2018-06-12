package fourth.q10;
import java.util.*;
import java.util.stream.*;

public class Q10 {
    public static void main(String[] a){
        IntStream stream = IntStream.range(1, 10);
        stream.forEach(System.out::println);

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        stream2.forEach(System.out::println);
    }
}
