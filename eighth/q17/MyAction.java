package eighth.q17;

import java.util.concurrent.RecursiveAction;

public class MyAction extends RecursiveAction {
    private String name;
    public MyAction(String str){
        super();
        this.name = str;
    }
    protected void compute(){
        String threadName = Thread.currentThread().getName();
        System.out.println(name + " " + threadName + " start");

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " " + threadName + " end");
    }

}
