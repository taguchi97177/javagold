package eighth;
import java.util.concurrent.*;

public class Q10 {
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
        ScheduledExecutorService exe = Executors.newScheduledThreadPool(4);

        exe.execute(r);
        exe.execute(r);
        exe.execute(r);
        exe.execute(r);
        exe.shutdown();

    }

}
