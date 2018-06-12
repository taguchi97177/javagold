package newio;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] aaa){
        String spa = FileSystems.getDefault().getSeparator();
        Path srcDir = Paths.get(".");

        System.out.println("path=" + srcDir.toString());
        System.out.println("url=" + srcDir.toUri().toString());
        System.out.println("絶対path=" + srcDir.toAbsolutePath());
        try {
            System.out.println("実際path=" + srcDir.toRealPath(LinkOption.NOFOLLOW_LINKS));
        }catch(IOException e){

        }

        Path srcFile = Paths.get("." + spa + "test.txt");
        try {
            Files.lines(srcFile).forEach(System.out::print);
        }catch(IOException e){

        }
    }
}
