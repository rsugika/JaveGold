import java.nio.file.Path;
import java.nio.file.Paths;

public class Check12 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("dir", "sample.txt");
        System.out.println(path.toAbsolutePath());
    }
}
