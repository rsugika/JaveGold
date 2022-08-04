package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Check20 {

	public static void main(String[] args) {
		
		/***
		 * リダクション操作を行うメソッド
		 * リダクション操作とは、一連の要素を一つにまとめる操作のこと
		 */

		 List<Integer> list = Arrays.asList(98, 99, 96, 97, 95);
		 // max()は、ストリーム内の要素を指定されたComparatorで並び変え、最大をもどす
		 Optional<Integer> result = list.stream().max((a, b) -> {
			if (a == b) return 0;
			if (a < b) return -1;
			return 1;
		 });
		 result.ifPresent(System.out::println);


		// min()は、ストリーム内の要素を指定されたComparatorで並び変え最小を戻す
		Optional<Integer> result2 = list.stream().min((a, b) -> {
		if (a == b) return 0;
		if (a < b) return -1;
		return 1;
		});
		result2.ifPresent(System.out::println);
}
}