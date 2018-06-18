package seventh;
import java.io.IOException;
import java.util.stream.*;
import java.nio.file.*;
public class Q29 {
    public static void main(String[] aaaa){
        try {
            Stream<String> stream = Files.lines(Paths.get("test.txt"));
            stream.forEach(System.out::println);
        }catch(IOException ee){
            ee.printStackTrace();
        }
    }
}
