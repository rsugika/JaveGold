import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Check8 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("db_settings.properties"));
        prop.list(System.out);
    }
}
