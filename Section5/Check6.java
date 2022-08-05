// package Section5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Check6 {
    public static void main(String[] args) throws Exception {
        
        FileWriter out = new FileWriter("output.txt", true);
        BufferedWriter writer = new BufferedWriter(out);
        try (writer) {
           writer.newLine();
           writer.write("buffering output");
           writer.flush();
        }
    }
}
