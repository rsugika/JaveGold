package Section2;

import java.util.function.BiPredicate;

public class Check8 {
    
}

class BigSample {
    public static void main() {
        // testメソッドに渡されているのは第1引数で
        // .classで終わっているのでtrue
        BiPredicate<String, String> b = (str, suffix) -> str.endsWith(suffix);
        System.out.println(b.test("sample.class", ".class"));
    }
}