package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Check19 {

	public static void main(String[] args) {
		
		/***
		 * リダクション操作を行うメソッド
		 * リダクション操作とは、一連の要素を一つにまとめる操作のこと
		 */

		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		 // reduce()は、リダクション操作の一つで値を累計的に結合していく関数を実行するためのもの
		 Optional<Integer> result = list.stream().reduce((a, b) -> a * b);
		 result.ifPresent(System.out::println);
	}
}