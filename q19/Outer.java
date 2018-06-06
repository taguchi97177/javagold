package q19;

public class Outer {
    public static void xxx(){
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        //        Inner inner =new Inner();
        inner.doIt();
    }

    public class Inner{
        public void doIt(){
            System.out.println("Outer.Inner.doIt()");
        }
    }
}
