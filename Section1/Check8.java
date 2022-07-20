package Section1;
import java.util.List;
import java.util.ArrayList;

public class Check8 {
    
}

/***
 * 匿名クラスにはコンストラクタを定義できない。匿名クラスには名前がないため
 * 匿名クラスはnewしているクラスをインスタンス化しているわけではない。
 * 下のコードではObjectクラスを継承した匿名のサブクラスのインスタンスを生成している
 */

class Test {
    public static void main(String[] args) {
        Object obj = new Object() {
            @Override
            public String toString() {
                return "hello";
            }
        };
    }
}

/***
 * ArrayListクラスを形容したサブクラスを匿名クラスとして定義してインスタンス化し
 * 初期化ブロックの中でスーパークラスのメソッドを呼び、追加することができる
 */

class ListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {
            {
            super.add("A");
            super.add("B");
            super.add("C");
            }
        };
    }
}