// package Section5;

import java.io.File;
import java.io.IOException;

public class Check1 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        // determine file is already exist or not
        if(file.exists() == false) {
            // create file
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());

        // make directory
        File dir = new File("test");
        if(dir.exists() == false) {
            dir.mkdirs(); 
        }
    }
}
