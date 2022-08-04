package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check27 {

	/***
	 * partitioningBy()で条件でグルーピングを行う
	 * @param args
	 */

	public static void main(String[] args) {		

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream()
			.map(x -> x * 3)
			.peek(x -> {
				System.out.println("Debug: " + x);
			})
			.filter(x -> x % 2 == 0)
			.forEach(x -> {
				System.out.println("value: " + x);
			});
	}
}
