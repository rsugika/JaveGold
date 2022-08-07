import java.util.Locale;
import java.util.ResourceBundle;

public class Check15 {
    public static void main(String[] args) throws Exception{
        ResourceBundle jp = ResourceBundle.getBundle("sample", Locale.JAPAN);
        ResourceBundle us = ResourceBundle.getBundle("sample", Locale.US);
        System.out.println(jp.getString("test"));
        System.out.println(us.getString("test"));
    }
}
