package tenth;
import java.io.*;
import java.util.*;
import java.nio.*;

public class Q10 {
    public static void main(String[] aaa){
        ResourceBundle rb = ResourceBundle.getBundle("MyTest");
        for (String str : rb.keySet()){
            System.out.println("key=" + str + "," + "value=" + rb.getString(str));
        }

    }
}

