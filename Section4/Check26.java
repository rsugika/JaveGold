package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check26 {

	/***
	 * partitioningBy()で条件でグルーピングを行う
	 * @param args
	 */

	public static void main(String[] args) {		

		List<Unit4Item> list = Arrays.asList(
			new Unit4Item(1, Unit4ItemType.BOOK, "java", 1980),
			new Unit4Item(2, Unit4ItemType.BOOK, "Lambda", 180),
			new Unit4Item(3, Unit4ItemType.MAGAZINE, "Software", 3980),
			new Unit4Item(4, Unit4ItemType.MAGAZINE, "Test", 1920)
		);

		Map<Boolean, List<Unit4Item>> map = list.stream().collect(
			Collectors.partitioningBy(
				item -> item.getPrice() > 1000));

		System.out.println(map);


	}
}
