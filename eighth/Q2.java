package eighth;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Q2 {
    private AtomicInteger count;
    public Q2(){
        this.count = new AtomicInteger();
    }
    public int getCount(){
        return this.count.incrementAndGet();
    }

    public static void main(String[] aaaa){
        Q2 counter = new Q2();
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
    }
}
