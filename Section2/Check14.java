package Section2;

import java.util.function.BinaryOperator;

/***
 * BinaryOperatorは、2つの値を処理して同じ型の結果を戻す処理
 * BiFunctionは2つの引数の方と戻り値の型を全て別々で指定できたのに対し、BinaryOperetorは引数の方と戻り値の方が全て同じ
 * 
 * 下のコードは、String型を扱うBinaryOperator型の変数bに、Strng型の引数を2つ受け取りそれらを結合して1つの文字として戻すラムダ式を代入している
 */

public class Check14 {
    public static void main(String[] args) {
        BinaryOperator<String> b = (str, add) -> str.concat(add);
        System.out.println(b.apply("Hello, ", "Lamba"));
    }    
}

