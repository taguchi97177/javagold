package first.q14;

public class Q14 implements Foo{
    public void x(){
        System.out.println("FOO");
    }

    public static void main(String[] args){
        Q14 qqq = new Q14();
        Foo.y();
//        Q14.y();
//        qqq.y();

        qqq.z();
    }
}
