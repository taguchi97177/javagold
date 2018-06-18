package seventh.q18;
import java.nio.file.*;
public class Q18 {
    public static void main(String[] aaa){
        Path path = Paths.get("c:\\aaaa\\bbb\\ccc");
        System.out.println(path.subpath(1,3));

    }
}
