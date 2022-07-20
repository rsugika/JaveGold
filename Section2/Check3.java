package Section2;

import java.util.function.Consumer;


// 関数型インターフェース: Consumer

public class Check3 {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Hello World");
    }
    
}

// 関数型インターフェース: Consumer

class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Hello World");
    }
}
