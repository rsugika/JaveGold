import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.Scanner;
import java.util.function.BiPredicate;

import javax.swing.SpinnerDateModel;

public class Check17 {
    public static void main(String[] args) throws Exception {

        Path base = Paths.get(".");
        Files.list(base).forEach(System.out::println);

        System.out.println("----");
        Files
        .walk(base.resolve("src"))
        .forEach(System.out::println);

        System.out.println("-----");

        BiPredicate<Path, BasicFileAttributeView> bp = (p, attr) -> {
            return p.toFile().getName().endsWith(".jpg");
        };
        // Files
        // .find(base, 3, bp)
        // .forEach(System.out::println);
    }
}