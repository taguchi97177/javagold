package sec_syou.q9;
import java.util.*;
public class Foo<T> {
    public void doIt(T val){
        System.out.println("Foo:" + val.getClass());
    }
}

class Bar<T> extends Foo<T>{
    public void doIt(T val){
        System.out.println("Bar" + val.getClass());
    }
}

class Bar2 extends Foo<String>{

}

class Bar3<T> extends Foo<String>{
    public void doIt2(T val){
        System.out.println("Bar3" + val.getClass());

    }

    public static void main(String[] args){
        Foo<Integer> foo = new Foo<Integer>();
        foo.doIt(10);
        Bar<Double> bar = new Bar<>();
        bar.doIt(10.0);
        Bar2 bar2 = new Bar2();
        bar2.doIt("AAA");
        Bar3<ArrayList<Integer>> bar3 = new Bar3<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList();
        list.add(50);
        bar.doIt(50.0);
        bar3.doIt2(list);

    }
}