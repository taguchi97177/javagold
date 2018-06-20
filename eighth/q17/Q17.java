package eighth.q17;

import java.util.concurrent.*;

public class Q17 {
    public static void main(String[] aaaa) {
        ForkJoinPool exe = new ForkJoinPool();
        RecursiveAction action = new MyAction("AAA");
        RecursiveAction action2 = new MyAction("BBB");

        exe.execute(action);

        System.out.println(exe.invoke(action2));

//        exe.shutdown();
        System.out.println("====================================");

        RecursiveTask<String> task = new MyTask("XXXXX");
        RecursiveTask<String> task2 = new MyTask("MMMMMMMMMMMM");
        System.out.println(exe.invoke(task));
        ForkJoinTask<String> res = exe.submit(task2);

        try {
            System.out.println(res.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

