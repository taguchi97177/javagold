package first.q11;

public class Foo {
    static {
        System.out.println("  static initializer");
    }
    {
        System.out.println("  initializer");
    }
    Foo(){
        System.out.println("  constructor");
    }
}
