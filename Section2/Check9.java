package Section2;

import java.util.function.Function;


public class Check9 {
    public static void main(String[] args) {
        new SampleFunction().main();
    }
}

/***
 * 関数型インターフェースFunctionは、引数を1つ受け取り、その引数を使った結果を1つ返す処理
 * applyメソッドを使用する
 */

class SampleFunction {   
    public static void main() {
        Function<String, Integer> f = x -> x.length();
        System.out.println(f.apply("sample"));
    }
}