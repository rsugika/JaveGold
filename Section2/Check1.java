package Section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Check1 {
    
}

/***
 * Supplierインターフェース
 * 引数を受け取らずに値を戻す処理を規定するもの
 * ジェネリクスの型パラメータを1つ受け取り、getメソッドの戻り値の型として利用する
 */

class Main {
    public static void main(String[] args) {
        
        Supplier<List<String>> supplier = () -> new ArrayList<>();
        List<String> list = supplier.get();
        // do somethings
    }
}