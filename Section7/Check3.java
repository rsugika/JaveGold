import java.util.ArrayList;
import java.util.List;

public class Check3 {
    public static void main() {
        // ジェネリクス、型推論
        // つかるのは変数の代入、メソッドの戻り値、メソッド呼び出しの引数
        List<String> list = new ArrayList<>();
        System.out.println(list);
        
        excute(new ArrayList<>());
    }

    private static List<String> test() {
        return new ArrayList<>();
    }

    private static void excute(List<String> list) {
        // do something
        test();
    }
}
