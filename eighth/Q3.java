package eighth;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Q3 {
    public static void main(String[] aaa){
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
        ConcurrentLinkedQueue<String> qq = new ConcurrentLinkedQueue<String>();
        ConcurrentLinkedDeque<String> dq = new ConcurrentLinkedDeque<String>();

        map.put(0, "AAA");
        map.put(1, "BBB");
        map.put(2, "CCC");
        map.put(3, "DDD");
        map.put(4, "EEE");

        qq.add("QQQQ");
        qq.add("WWWW");
        qq.add("EEEE");
        qq.add("RRRR");
        qq.add("TTTT");

        dq.addFirst("F_AAA");
        dq.addFirst("F_BBB");
        dq.addFirst("F_CCC");
        dq.addFirst("F_DDD");
        dq.addLast("B_AAA");
        dq.addLast("B_BBB");
        dq.addLast("B_CCC");
        dq.addLast("B_DDD");

        for(Integer key : map.keySet()){
            System.out.println(key + "  " + map.get(key));
        }

        System.out.println(map.getOrDefault(4, "#&&&&&&&"));
        System.out.println(map.getOrDefault(10, "########"));
        map.putIfAbsent(0, "$$$$");
        map.putIfAbsent(20, "%%%%%%");
        System.out.println(map.get(0));
        System.out.println(map.get(20));

        qq.forEach(System.out::println);
        dq.forEach(System.out::println);
    }
}
