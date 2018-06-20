package eighth;
import java.util.*;
import java.util.stream.*;
public class Q18 {
    public static void main(String[] aaaa){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = list.parallelStream();
        stream.forEach(System.out::print);

        System.out.println("");
        System.out.println("+++++++++++++++++++++++++");
        List<Integer> plist = Arrays.asList(1,2,3,4,5,6,7,8,9);;
        Stream<Integer> stream2 = plist.parallelStream().sequential();
        stream2.forEach(System.out::print);
    }
}
