import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class Check7 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        prop.load(new FileReader("db_settings.properties"));

        // display all values 
        prop.forEach((k, y) -> System.out.println(k + "=" + y));

        Set keys = prop.keySet();
        for (Object key : keys) {
            System.out.println(prop.get(key));
        }
    }    
}
