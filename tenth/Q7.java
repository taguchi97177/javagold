package tenth;
import java.io.*;
import java.util.*;

public class Q7 {
    public static void main(String[] aaaa){

        try(InputStream in = new FileInputStream("MyTest.properties")){
            Properties prop = new Properties();
            prop.load(in);
            prop.list(System.out);
            prop.stringPropertyNames().forEach(System.out::println);
        }catch(IOException ee){
            ee.printStackTrace();
        }

        try(InputStream in = new FileInputStream("MyTestXML.properties")){
            Properties prop = new Properties();
            prop.loadFromXML(in);
            prop.list(System.out);
            Set set = prop.stringPropertyNames();
            for(Object str : set.toArray()){
                System.out.println(prop.getProperty(str.toString()));
            }
        }catch(IOException ee){
            ee.printStackTrace();
        }

    }
}
