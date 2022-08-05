// package Section5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Check7 {
    public static void main(String[] args) throws Exception {
        
         FileInputStream fls = new FileInputStream("sample.jpg");
         BufferedInputStream bis = new BufferedInputStream(fls);

         FileOutputStream fos = new FileOutputStream("Sample_bk.jpg");
         BufferedOutputStream bos = new BufferedOutputStream(fos);

         try (bis; bos) {
            byte[] data = null;
            while ((data = bis.readNBytes(1024)).length != 0) {
                bos.write(data);
            }
            bos.flush();
         }
    }
}
