package sec_syou.q6;

public class Foo {
    <T extends Number> void doIt(T t){
        System.out.println(t);
    }
    <T extends Number> T bai(T t){
        return t;
    }

    <T extends Number, S extends Number> Number change(T t, S s){
        return t.intValue() + s.intValue();
    }

    public static void main(String[] args){
        Foo foo = new Foo();
        foo.doIt(new Integer(19));
        foo.doIt(20.0);
        System.out.println(foo.bai(10)*2);
        System.out.println(foo.bai(40.0)*2);
        System.out.println(foo.change(10, 20));
    }
}
