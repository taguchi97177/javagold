package eighth.q6;

public class Q61 {
    public static void main(String[] aaaa){
        Runnable r = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " start");
            try{
                Thread.sleep((int)(Math.random() * 5000));
            }catch(InterruptedException ee){
                ee.printStackTrace();
            }
            System.out.println(threadName + " end");
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }
}
