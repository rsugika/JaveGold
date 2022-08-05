import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Check3 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc'derby://localhost:1527/data/Sample");
            System.out.println(con);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
