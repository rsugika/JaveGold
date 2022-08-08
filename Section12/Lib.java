import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Lib {

    public void test() throws Exception{
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            @Override
            public Object run() {
                try {
                    Files.list(Paths.get("/")).forEach((p) -> {
                        System.out.println(p.getFileName());
                    });
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
                return null;
            }
        });
    }

}
