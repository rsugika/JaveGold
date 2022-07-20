package Section1;

public class Check10 {
    
}

/***
 * InterfaceのStaticメソッドは、そのInterfaceを実装したクラスでオーバーライドすることができない
 * クラスに定義したstaticメソッドも同様にオーバーライドできない
 */

interface Sample {
    public static void test() {
        System.out.println("A");
    }
}

class SampleImpl implements Sample {
    // アノテーションをつけるとコンパイルエラーになる
    // @Override
    // The method test() of type SampleImpl must override or implement a supertype method
    public static void test() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        Sample.test();
    }
}