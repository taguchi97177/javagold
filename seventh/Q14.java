package seventh;
import java.nio.file.*;
import java.util.stream.*;
public class Q14 {
    public static void main(String[] aaa) {
        FileSystem system = FileSystems.getDefault();
        Path path = system.getPath("test.txt");
        Path path2 = Paths.get("." + system.getSeparator() + "test.txt");
        System.out.println("ファイルが等しい::" + path.equals(path2));
        System.out.println("name(0)::" + path.getName(0));
//        System.out.println("name(1)::" + path.getName(1));
        System.out.println("root::" + path.getRoot());
        System.out.println("parent::"+path.getParent());
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());

        System.out.println("そのまま::" + path2);
        System.out.println("nomalize::" + path2.normalize());
        System.out.println("絶対そのまま::" + path2.toAbsolutePath());
        System.out.println("絶対nomalize::" + path2.normalize().toAbsolutePath());

    }
}
