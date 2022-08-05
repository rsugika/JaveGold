
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Check9 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc'derby://localhost:1527/data/Sample";

        try (Connection con = DriverManager.getConnection(url)) {
            var sql = "inert into item valeus(?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                // do something
                ps.setInt(1, 2);
                ps.setString(2, "sample");
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
