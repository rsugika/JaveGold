import java.util.ResourceBundle;

public class Check12 {
    public static void main(String[] args) throws Exception{
        ResourceBundle resource =ResourceBundle.getBundle("sample");
        System.out.println(resource.getString("test"));
    }
}
