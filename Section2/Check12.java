package Section2;

import java.util.function.UnaryOperator;

/***
 * UnaryOperatorは、処理対象となる値を1つだけ持つ単項演算子の処理を表現できる関数型インターフェース
 * functionと異なる点は、Functionが引数の型と戻り値の型を指定できたのに対しUnarayOperatorは引数の型と戻り値の型が同じ
 * 下の処理では数値を1つ増やす処理と、整数値を2倍にするラムダ式
 */

public class Check12 {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> ++x;
        System.out.println(increment.apply(10));

        UnaryOperator<Integer> twice = x -> x * 2;
        System.out.println(twice.apply(10));
    } 
}