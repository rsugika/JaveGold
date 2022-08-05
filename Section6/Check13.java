
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class Check13 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc'derby://localhost:1527/data/Sample";
            try (Connection con = DriverManager.getConnection(url)) {
                String[] names = {"apple", "banana", "orange"};
                var sql = "insert into item valeus (?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sql)) {
             
                    int i = 10;
                    for (String name : names) {
                        ps.setInt(1, i);
                        ps.setString(2, name);
                        ps.addBatch();
                        i++;
                    }

                    int[] results = ps.executeBatch();
                    System.out.println(Arrays.toString(results));

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
