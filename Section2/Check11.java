package Section2;

import java.util.function.BiFunction;

/***
 * BiFunctionは2つの引数を処理して、結果を戻す関数型インターフェース
 * 変数bには第一引数と第二引数の文字列を連結した新しい文字列を戻すラムダ式が代入されている
 */

public class Check11 {
    public static void main(String[] args) {    
        BiFunction<String, String, String> b = (str, addStr) -> str.concat(addStr);

        String result = b.apply("Hello" , "Lambda");
        System.out.println(result);
    } 
}