// package Section5;

// import java.io.File;
import java.io.FileReader;
// import java.io.IOException;

public class Check3 {
    public static void main(String[] args) throws Exception {
     
        // FileReader reader = null;
        // try {
        //     reader = new FileReader("sample.txt");
        //     int i = 0;

        //     while ((i = reader.read()) != -1) {
        //         char c = (char) i;
        //         System.out.print(c);
        //     }
        // } finally {
        //     if (reader != null) {
        //         reader.close();
        //     }
        // }

        
        // try-with-resource is much better

        FileReader reader = new FileReader("sample.txt");
        try (reader) {
            int i = 0;
            while ((i = reader.read()) != -1) {
                char c = (char) i;
                System.out.print(c);
            }
        }
        
    }
}
