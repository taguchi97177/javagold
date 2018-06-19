package tenth.q14;

import java.util.*;

public class Q14 {
    public static void main(String[] aaaa){
        ResourceBundle rb = ResourceBundle.getBundle("tenth.q14.SpaishResources");
        for (String str : rb.keySet()){
            System.out.println("key=" + str + "," + "value=" + rb.getString(str));
        }

    }
}
