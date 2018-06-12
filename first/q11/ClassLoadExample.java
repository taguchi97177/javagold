package first.q11;

public class ClassLoadExample {
    public static void main(String[] args){
        try{
            System.out.println("[Class loading]");
            Class.forName("first.q11.Foo", true, ClassLoadExample.class.getClassLoader());
            System.out.println("[Instantation]");
            Foo foo = new Foo();

        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
