import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Check7 {
    public static void main(String[] args) throws Exception {
        Files.list(Paths.get("/")).forEach((p) -> {
            System.out.println(p.getFileName());
        });

        Lib lib = new Lib();
        lib.test();
    }
}

