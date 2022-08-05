import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check4 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc'derby://localhost:1527/data/Sample");
            System.out.println(con);
        } catch (SQLException e) {
            throw new RuntimeException();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // try-with-resource
        try (Connection c = DriverManager.getConnection("jdbc'derby://localhost:1527/data/Sample")) {
            System.out.println(con);
        } catch (SQLException e) {
            throw new RuntimeException();
        }

        // close resultSet Object

        String url = "jdbc'derby://localhost:1527/data/Sample";
        String sql = "select * from item";
        try(Connection conn = DriverManager.getConnection(url); PreparedStatement ps = con.prepareStatement(sql)) {
            for (String id : args) {
                try (ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        System.out.println(rs.getString("name"));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
