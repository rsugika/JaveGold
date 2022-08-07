import java.io.Closeable;
import java.io.IOException;

public class Check5 {
    
}

class SampleResource5 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close");
    }
}

class SampleResource51 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Close");
    }
}