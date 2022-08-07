import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class Check11 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader(
            "sample.properties",
            Charset.forName("UTF-8")));
        System.out.println(prop.getProperty("test"));

        Properties prop2 = new Properties();
        prop.load(new InputStreamReader(
            new FileInputStream(
            "sample.properties"), "utf-8"));
        System.out.println(prop2.getProperty("test"));
    }
}
