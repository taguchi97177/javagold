package third;
import java.util.*;

public class Ramuda {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("サ");
        list.add("ム");
        list.add("ら");
        list.add("い");

        System.out.println("拡張for");
        for(String str : list){
            System.out.println(str);
        }
        System.out.println("forEach");
        list.forEach(str -> System.out.println(str + ":aaa"));
    }
}
