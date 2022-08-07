import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Check6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(new File("inout.tzt")))) {
            BufferedWriter out = new BufferedWriter(new FileWriter(new File("result.txt")));
            String line = null;
            while((line = in.readLine()) != null) {
                out.append(line);
                out.newLine();
            }
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    //     SampleResource5 resource = new SampleResource5();
    //     try (resource) {
    //         resource = new SampleResource5();
    //     }
    //     resource = new SampleResource5();
    }
}
