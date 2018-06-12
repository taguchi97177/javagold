package second.q23;
import java.util.*;

public class Q23 {

    public static void main(String[] args){
/*
        Set<Product> set = new TreeSet<Product>();
        set.add(new Product(3, "B"));
        set.add(new Product(1, "C"));
        set.add(new Product(2, "A"));
        System.out.println(set);
*/
        Set<Product2> set = new TreeSet<Product2>();
        set.add(new Product2(3, "B"));
        set.add(new Product2(1, "C"));
        set.add(new Product2(2, "A"));
        System.out.println(set);

    }
}
 class Product implements Comparator<Product>{
    private int id;
    private String name;
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return id + ":" + name;
    }
    public int compare(Product p1, Product p2){
        return p1.id - p2.id;
    }
}

class Product2 implements Comparable<Product2>{
    private int id;
    private String name;
    public Product2(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return id + ":" + name;
    }
    public int compareTo(Product2 p2){
        return this.id - p2.id;
    }
}
