
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Check12 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc'derby://localhost:1527/data/Sample";

        try (Connection con = DriverManager.getConnection(url)) {
            var sql = "select * from item";
            try (PreparedStatement ps = con.prepareStatement(args[0])) {
             
                if (ps.execute() == false) {
                    System.out.println(ps.getUpdateCount());
                    return;
                }

                ResultSet rs = ps.getResultSet();
                ResultSetMetaData meta = rs.getMetaData();
                int colSize = meta.getColumnCount();

                while(rs.next()) {
                    for (int i = 1; i <= colSize; i++) {
                        System.out.println(rs.getString(i));
                    }
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
