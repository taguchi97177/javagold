package first.q14;

public interface  Foo {
    void x();
    static void y(){
        System.out.println("static");
    }
    default void z(){
        System.out.println("default");
    }
}
