package q20;

public class FooImpl implements Foo{
    public void doIt(){
        System.out.println("Foo OK!");
    }

    public static void main(String[] args){
        FooImpl imp = new FooImpl();
        imp.doIt();

        Foo foo = new Foo(){
            public void doIt(){
                System.out.println("OK Foo!!!!");
            }
        };
        foo.doIt();
    }
}
