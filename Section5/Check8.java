import java.io.Console;

// package Section5;


public class Check8 {
    public static void main(String[] args) throws Exception {
    
        Console console = System.console();
        // String str = console.readLine();
        char[] password = console.readPassword();
        System.out.println(password);
    }
}
