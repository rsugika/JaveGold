package Section4;
import java.util.Arrays;

public class Check18 {

	/***
	 * ストリームの要素に対して何かしらの処理を行いたいのであればmap()を利用する
	 * 
	 * 入力された要素の集合の型と、処理を施した結果を表す出力の集合の型を一致させる必要なない
	 * @param args
	 */
	public static void main(String[] args) {
		String[] fruits = {"apple", "orange", "banana"};

		Arrays
			.stream(fruits)
			.map(f -> f.toUpperCase())
			.forEach(System.out::println);

	/***
	 * * 次のような処理を行うことも可能
	 * String型の集合からInteger型の集合に変換されることとなる
	 */

		String[] fruits2 = {"apple", "orange", "banana"};

			Arrays
			.stream(fruits2)
			.map(f -> f.length())
			.forEach(System.out::println);
		}





}
