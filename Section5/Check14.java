import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Check14 {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get("dir", "subdir");
        if (Files.exists(dir) == false) {
            Files.createDirectories(dir);
        }
        Path a = Paths.get("data.txt");
        Files.createFile(dir.resolve(a));
    
    }
}