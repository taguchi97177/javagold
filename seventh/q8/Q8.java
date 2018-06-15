package seventh.q8;
import java.io.*;

public class Q8 {
    public static void main(String[] aaa){
        Console cons = System.console();
        if (cons == null){
            System.out.println("*** NULL ***");
        }else {
            String line = cons.readLine();
            System.out.println("***" + line + " ****");
        }
    }
}
