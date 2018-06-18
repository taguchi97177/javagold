package seventh;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Q28 {
    public static void main(String[] aaa) {
        Path path = Paths.get("C:\\work2");
        try {
            Files.walkFileTree(path, new MyVisitor());

        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }
    static class MyVisitor extends SimpleFileVisitor<Path> {
        public MyVisitor() {
            super();
        }

        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                throws IOException {
            System.out.println("visitFile::" + file);
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult postVisitDirectory(Path dir, IOException e)
                throws IOException {
            if (e == null) {
                System.out.println("postVisitDir::" + dir);
                return FileVisitResult.CONTINUE;
            } else {
                // directory iteration failed
                throw e;
            }
        }

        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException{
            System.out.println("preVisitDir::" + dir);
            return FileVisitResult.CONTINUE;

        }

    }
}
