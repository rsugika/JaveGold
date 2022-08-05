import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class Check16 {
    public static void main(String[] args) throws Exception {

        Path sample = Paths.get("dir","sample.txt");
        if (Files.exists(sample) == false) {
            Files.createFile(sample);
        }
        Scanner scanner = new Scanner(System.in);
        BufferedWriter out = Files.newBufferedWriter(sample, StandardOpenOption.APPEND);

        try (scanner; out) {
            System.out.println(">");
            out.write(scanner.nextLine());
            out.newLine();
        }

        BufferedReader in = Files.newBufferedReader(sample);
        try (in) {
            in.lines().forEach(System.out::println);
        }
    
    }
}