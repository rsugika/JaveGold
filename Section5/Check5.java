// package Section5;

import java.io.FileWriter;

public class Check5 {
    public static void main(String[] args) throws Exception {
        
        FileWriter out = new FileWriter("output.txt", true);
        try (out) {
            out.write("\n");
            out.write("Hello, Java!");
        }
    }
}
