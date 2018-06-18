package seventh;
import java.io.IOException;
import java.util.stream.*;
import java.nio.file.*;

public class Q30 {
    public static void main(String[] aaaa){
        Path path = Paths.get("c:\\work2");
        try(Stream<Path> stream = Files.list(path)){
            stream.filter(Files::isRegularFile).forEach(System.out::println);

        }catch(IOException ee){
            ee.printStackTrace();
        }
    }
}
