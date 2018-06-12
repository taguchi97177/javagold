package fourth.q18;
import java.util.*;
import java.util.stream.*;

public class Q18 {
    public static void main(String[] aaa){
        int[] arr = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(arr);
        System.out.println(stream.allMatch(val -> val % 2 == 0));

        IntStream stream2 = Arrays.stream(arr);
        OptionalInt value =  stream2.findAny();
        System.out.println("*********************");
        System.out.println(value.getAsInt());

    }
}
