package Section2;

import java.util.function.Predicate;


/***
 * Predicateは関数型インターフェースの一種
 * 引数を一つ受け取り、何かしらの判断を行い、boolean型で戻す
 * 
 * testメソッドを使用する
 */

public class Check6 {
    public static void main(String[] args) {
        Predicate<String> p1 = x -> x.isEmpty();
        System.out.println(p1.test(""));
    }
}