import java.io.FileInputStream;
import java.util.Scanner;

// package Section5;


public class Check9 {
    public static void main(String[] args) throws Exception {
    
        FileInputStream fis = new FileInputStream("sample.txt");
        Scanner scanner = new Scanner(fis);
        try (scanner) {
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }

    }
}
