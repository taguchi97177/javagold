package fourth.q11;
import java.util.*;
import java.util.stream.*;

public class Q11 {
    public static void main(String[] aaa){
        Stream<String> stream = Stream.of("A","B", "C");
        stream.forEach(System.out::println);
    }
}
