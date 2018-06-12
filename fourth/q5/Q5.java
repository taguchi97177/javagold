package fourth.q5;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q5 {
    public static void main(String[] a){
        List<String> list = Arrays.asList("A","X","N","D");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);


        Stream<String> stream2 = list.stream();
        stream2.forEach(str -> System.out.println(str));


        Stream<String> stream3 = list.stream();
        stream3.map((str) -> { if (str.equals("C")){ return "CCC";}else{return str;}}).forEach(str -> System.out.println(str));

        Stream<String> stream4 = list.stream();
        stream4.sorted().forEach(System.out::println);

    }
}
