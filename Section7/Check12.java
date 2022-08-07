import java.util.ArrayDeque;
import java.util.Deque;

public class Check12 {
   public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(5);
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addFirst("D");
        deque.addFirst("E");

        deque.stream().forEach(System.out::println);
    }
}
