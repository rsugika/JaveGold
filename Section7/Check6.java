import java.util.Collection;
import java.util.List;

public class Check6 {
    public static void main(String[] args) {
        new Sample6().main();
    }
}

class Sample6 {
    public static void main() {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        List<String> b = List.of("A", "B", "C");
        printAll(a);
        printAll(b);
    }

    // private static void printAll(Collection<String> collection) {
    //     collection.stream()
    //     .forEach(System.out::println);
    // }

    // 非境界ワイルドカードを使ったばあい
    private static void printAll(Collection<?> collection) {
        collection.stream()
        .forEach(System.out::println);
    }

}