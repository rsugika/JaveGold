import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Check13 {
    public static void main(String[] args) throws Exception {
        System.out.println(">");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            // get path of in the  dir directory
            Path p = Paths.get("dir", name);
            if (Files.exists(p) == false) {
                Files.createFile(p);
            }

            System.out.println(Files.getLastModifiedTime(p));
            // System.out.println(Files.getPosixFilePermissions(p));

            System.out.println("delete y/n ? >");
            if ("y".equals(scanner.nextLine())) {
                Files.delete(p);
                System.out.println("deleted");
            }
        }
    
    }
} 