package fourth.q17;
import java.util.*;
import java.util.stream.*;
public class Q17 {
    public static void main(String[] aaaa){
        Stream<String> stream = Stream.of("banana", "apple", "orange")
                .filter(str -> str.length()>5)
                .peek(str -> System.out.println(str + " "))
                .map(String::toUpperCase)
                .peek(str -> System.out.println(str + " "));
        System.out.println("OK ");
        System.out.println(stream.count());
    }
}
