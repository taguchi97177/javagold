
package third;
import java.util.*;
import java.util.function.Function;

public class Ramda2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("サ");
        list.add("ム");
        list.add("ら");
        list.add("い");

        System.out.println("拡張for");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("forEach");
        list.forEach(str -> System.out.println(str + ":aaa"));

        Hello hello = (str) -> {
            System.out.println(str);
            System.out.println("Hello");
            System.out.println("こんにちは");
            return 100;
        };


        System.out.println(hello.helloWorld("われわれは"));
        Function<String, Integer> func = String::length;
        System.out.println(func.apply("AAAAAAAAAAAAA"));


    }
}

interface Hello {
    int helloWorld(String str);
}