package first.q19;

public class Q19 {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.xxx();

        Outer.Inner inner = new Outer().new Inner();
        inner.doIt();
    }
}
