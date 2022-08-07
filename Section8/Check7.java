import java.util.ArrayList;
import java.util.List;

public class Check7  {
    public static void main(String[] args) {
        new Sample7().sample();
    }
}

// コンパイルすると警告がでるコード
// @SuppressWarnings()で警告を抑制することができる
@SuppressWarnings("unchecked")
class Sample7 {
    public void sample() {
        List list = new ArrayList();
        list.add("String");
    }
}

class Test7 {
    // 非推奨のメソッドであることを明示するアノテーション
    @Deprecated
    public void test() {
        // do something
    }

    // 将来的に削除予定のあるメソッドに対するアノテーション
    @Deprecated(forRemoval = true) 
    public void test2() {
        // do something
    }

}

class UseTest7 {
    public void sample() {
        new Test7().test();
    }
}