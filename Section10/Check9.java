import java.io.FileReader;
import java.util.Properties;

public class Check9 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        prop.load(new FileReader("db_settings.properties"));

        // nameというキーの値を取り出してコンソールに表示
        System.out.println(prop.getProperty("name"));
    }
}
