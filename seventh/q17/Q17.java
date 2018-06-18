package seventh.q17;
import java.nio.file.*;

public class Q17 {
    public static void main(String[] aaa){
        Path path = Paths.get("c:\\aaaa\\bbb\\ccc");
        System.out.printf("%s, %s, %s, %s, %s, %d", path.getRoot(), path.getName(0), path.getName(1), path.getName(2), path.getFileName(), path.getNameCount());
    }
}
