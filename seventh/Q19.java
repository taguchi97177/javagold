package seventh;
import java.nio.file.*;
public class Q19 {
    public static void main(String[] aaa){
        Path path1 = Paths.get("C:\\aaaa");
        Path path2 = Paths.get("D:\\bbbb");
        Path path3 = Paths.get("cccc");
        Path path4 = Paths.get("ddddd");
        System.out.println(path1.resolve(path2));
        System.out.println(path1.resolve(path2).resolve(path3));
        System.out.println(path3.resolve(path4));

    }

}
