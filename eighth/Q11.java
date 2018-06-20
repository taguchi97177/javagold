package eighth;
import java.util.concurrent.*;

public class Q11 {
    public static void main(String[] aaaa) {

        Callable<String> r = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " start");
            try {
                Thread.sleep((int) (Math.random() * 10000));

            } catch (InterruptedException  ee) {
                ee.printStackTrace();
            }
            return threadName + " end";
        };
        ScheduledExecutorService exe = Executors.newScheduledThreadPool(5);

        Future<String> fu1 = exe.submit(r);
        Future<String> fu2 = exe.submit(r);
        Future<String> fu3 = exe.submit(r);
        Future<String> fu4 = exe.submit(r);

        try {
            System.out.println(fu1.get());
            System.out.println(fu2.get());
            System.out.println(fu3.get());
            System.out.println(fu4.get());
            exe.shutdown();
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
}
