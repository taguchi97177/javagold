package second.q21;
import java.util.*;

public class Q21 {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap();
        map.put(1, "Alien");
        map.put(2, "bill");
        map.put(3, "Change");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}