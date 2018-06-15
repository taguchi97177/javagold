package seventh.q11;

import java.io.*;

public class Q11 {
    public static void main(String[] aaa){
        DataTest data = new DataTest(100, "ABCDEFGqqqqq");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sampleDataTest.txt"))){
            out.writeObject(data);
        }catch(IOException e){
            e.printStackTrace();
        }
        data = null;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("sampleDataTest.txt"))){
            DataTest data2 = (DataTest)in.readObject();
            System.out.println(data2);
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException ee){
            ee.printStackTrace();
        }


    }

    static class DataTest implements Serializable{
        private int id;
        private String name;
        public DataTest(int val, String str){
            this.id = val;
            this.name = str;
        }
        public String toString(){
            return id + ":::" + name;
        }


    }
}
