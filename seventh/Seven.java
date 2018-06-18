package seventh;
import javax.naming.directory.BasicAttribute;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Seven {
    public static void main(String[] aaaa){
        {
            System.out.println("=====  Q20 =====");
            Path path1 = Paths.get("c:\\aaaa\\bbbb");
            Path path2 = Paths.get("ccccc");
            Path path3 = Paths.get("ddddd");
            Path path4 = Paths.get("d:\\xxxxx\\yyyy");
            System.out.println(path1.resolveSibling(path2));
            System.out.println(path2.resolveSibling(path3));
            System.out.println(path1.resolveSibling(path4));
        }
        {
            System.out.println("=====  Q21 =====");
            Path path1 = Paths.get("c:\\aaaa\\bbbb\\..\\..\\xxx\\.\\temp.txt");
            System.out.println(path1.normalize());
        }
        {
            System.out.println("=====  Q22 =====");
            Path path1 = Paths.get("c:\\aaaa\\bbbb");
            Path path2 = Paths.get("c:\\xxxxx\\yyyy");
            Path path3 = Paths.get("c:\\aaaa\\yyyy");
            System.out.println(path1.relativize(path2));
            System.out.println(path1.relativize(path3));
        }
        {
            System.out.println("=====  Q24 =====");
            Path path1 = Paths.get("test.txt");
            System.out.println("存在："+Files.exists(path1));
            Path path2 = Paths.get("test2.txt");
            System.out.println("存在2："+Files.exists(path2));
            try {
                Files.copy(path1, path2);
            }catch(IOException ee){
                ee.printStackTrace();
            }
            System.out.println("存在2："+Files.exists(path2));
            Path path3 = Paths.get("test2.txt");
            try {
                Files.copy(path1, path3);
            }catch(IOException ee){
                ee.printStackTrace();
            }
            try {
                Files.copy(path1, path3, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("上書き成功");
            }catch(IOException ee){
                ee.printStackTrace();
            }
       }
    }
}
