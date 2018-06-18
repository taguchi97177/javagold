package seventh;
import java.io.IOException;
import java.nio.file.*;
import java.nio.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Q25 {
    public static void main(String[] aaa){
        Path path1 = Paths.get("test.txt");
        try{
            BasicFileAttributes attr = Files.readAttributes(path1, BasicFileAttributes.class);
            System.out.println("create time::"+attr.creationTime());
            System.out.println("key::"+attr.fileKey());
            System.out.println("isDir::"+attr.isDirectory());
            System.out.println("regular file::"+attr.isRegularFile());
            System.out.println("access time::"+attr.lastAccessTime());
            System.out.println("size::"+attr.size());



        }catch(IOException ee){
            ee.printStackTrace();
        }
    }
}
