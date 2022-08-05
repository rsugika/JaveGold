
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Check6 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc'derby://localhost:1527/data/Sample";
        
        try (Connection con = DriverManager.getConnection(url)) {
            var sql = "select * from item";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                // do something
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
