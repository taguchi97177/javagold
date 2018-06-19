package eighth.q6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Q62 {
    public static void main(String[] aaaa){
        CyclicBarrier barrier = new CyclicBarrier(3);
        Runnable r = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " start");
            try{
                Thread.sleep((int)(Math.random() * 10000));

                System.out.println(threadName + " バリア到達" + " " + barrier.getNumberWaiting());
                barrier.await(10, TimeUnit.SECONDS);
            }catch(InterruptedException | BrokenBarrierException | TimeoutException ee){
                ee.printStackTrace();
            }
            System.out.println(threadName + " end");
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }

}
