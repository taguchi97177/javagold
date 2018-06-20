package eighth.q17;

import java.util.concurrent.RecursiveTask;

public class MyTask extends RecursiveTask<String> {
    private String name;
    public MyTask(String str){
        this.name = str;
    }
    protected String compute(){
        String threadName = Thread.currentThread().getName();
        System.out.println(name + " " + threadName + " start");

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " " + threadName + " edm");
        return name + " " + threadName + " return";
    }
}
