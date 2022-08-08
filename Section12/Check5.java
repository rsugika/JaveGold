import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check5 {
    
    public static final int FILE_SIZE_LIMIT = 1048579;
    public void ReadNames(String filename) throws IOException {
        long size = Files.size(Paths.get(filename));
        if (FILE_SIZE_LIMIT < size) {
            throw new IOException("File too large");
        } else if (size == 0L) {
            throw new IOException("File size can not be determined");
        }
        // do soemthing
    }
    
    public static void tryWithResource() {

        String sqlQuery = "select * from hogehoge";
        // try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery);
        //     ResultSet rs = stmt.executeQuery()) {
        //         // do something
        // } catch (SQLException e) {
        //     // 例外処理
        // } 

    }
    

}


