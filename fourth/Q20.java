package fourth;
import java.util.*;
import java.util.stream.*;

public class Q20 {
    public static void main(String[] aaa){
        List<List<String>> list = Arrays.asList(

        Arrays.asList("0_AAAA", "0_BBB"),Arrays.asList("1_AAA", "1_BBB")
        );

        list.stream().flatMap(lst -> lst.stream()).distinct().forEach(System.out::print);
    }


}

