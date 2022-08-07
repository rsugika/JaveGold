import java.util.Set;
import java.util.TreeSet;

public class Check13 {
   public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");
        set.add("E");

        set.stream().forEach(System.out::println);
    }
}
