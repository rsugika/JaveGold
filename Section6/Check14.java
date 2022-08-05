
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Check14 {
public static void main(String[] args) throws SQLException {
        String url = "jdbc'derby://localhost:1527/data/Sample";
        try (Connection con = DriverManager.getConnection(url)) {
            String proc = "CALL UPDATE_ITEM(?, ?)";
            try (CallableStatement cs = con.prepareCall(proc)) {
                cs.setString(1, "call procedure");
                cs.setInt(2, 1);
                cs.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

class ProcedureExample {
    public static void testProc(String name, int id) throws Exception {
        String connectionURL = "jdbc:default:connection";
        Connection con = DriverManager.getConnection(connectionURL);
        String sql = "update item set name = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}