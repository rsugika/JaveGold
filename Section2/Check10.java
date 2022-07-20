package Section2;
import java.util.function.Function;

public class Check10 {
    public static void main(String[] args) {
        Function<Integer, Integer> plus = (x) -> x + 2;
        Function<Integer, Integer> times = (x) -> x * 2;

        // 合成した新しいFunction生成
        Function<Integer, Integer> a = plus.andThen(times);
        Function<Integer, Integer> b = times.andThen(plus);

        // 合成したFunctionのapplyメソッドを呼び出し
        System.out.println(a.apply(5));
        System.out.println(b.apply(5));
    }
}

/***
 * Functionインターフェース合成する場合
 */

class Main {
    public static void main() {
        Function<Integer, Integer> plus = (x) -> x + 2;
        Function<Integer, Integer> times = (x) -> x * 2;

        System.out.println(plus.andThen(times).apply(5));
        System.out.println(times.andThen(plus).apply(5));
    }
}

