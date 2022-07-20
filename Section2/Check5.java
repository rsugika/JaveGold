package Section2;

import java.util.HashMap;
import java.util.function.BiConsumer; 

/***
 * 関数型インターフェースのBigConsumerは引数を2つ取ることができる
 * Consumerと同じaccept()を規定している
 */

public class Check5 {
    public static void main(String[] args) {

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bi = (k,v) -> map.put(k,v);

        // BigConsumerは引数を2つ渡せる
        bi.accept("apple", 3);
        bi.accept("orange", 2);
        System.out.println(map);

    };
}

/***
 * メソッド参照での記載
 */

 class methodReference {
    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        // ラムダ式ではなくメソッド参照での記載
        BiConsumer<String, Integer> bi = map::put;
        bi.accept("apple", 3);
        bi.accept("orange", 2);

        System.out.println(map);
    }
 }