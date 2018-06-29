package seventh;
import java.io.*;
public class Q9 {
    public static void main(String[] aaa){
        Console cons = System.console();
        if (cons == null){
            System.out.println("*** NULL ***");
        }else {
            char[] pass = cons.readPassword("[%s]", "Password> ");
            System.out.print("*** ");
            System.out.print(pass);
            System.out.println(" ****");
        }
    }

}
