package tenth;
import java.io.*;
import java.util.*;
import java.nio.*;
public class Q8 {
    public static void main(String[] aaaa){

        try(OutputStream out = new FileOutputStream("MyTestXML.properties")){
            Properties prop = new Properties();
            prop.setProperty("AAA", "あいうえお");
            prop.setProperty("BBB", "かきくけこ");
            prop.setProperty("CCC", "さしすせそ");
            prop.setProperty("DDD", "たちつてと");

            prop.storeToXML(out, "Comments");


        }catch(IOException ee){
            ee.printStackTrace();
        }

    }
}
