package seventh;
import java.io.*;
public class Q7 {
    public static void main(String[] aaa){

        try(PrintWriter out = new PrintWriter("out.txt")){
            out.println("Hellow");
            out.println(0.05);
            out.println(true);
            out.println(String.valueOf(10.35));
        }catch(IOException ee){
            ee.printStackTrace();
        }
    }
}
