package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check24 {

	public static void main(String[] args) {		

		List<Unit4Item> list = Arrays.asList(
			new Unit4Item(1, Unit4ItemType.BOOK, "java", 1980),
			new Unit4Item(2, Unit4ItemType.BOOK, "Lambda", 180),
			new Unit4Item(3, Unit4ItemType.MAGAZINE, "Software", 3980),
			new Unit4Item(4, Unit4ItemType.MAGAZINE, "Test", 1920)
		);

		/***
		 * groupingBy()はグループごとリストを返す
		 */
		Map<Unit4ItemType, List<Unit4Item>> group = list.stream().collect(
			Collectors.groupingBy(t -> t.getType()));
			System.out.println(group);
	}
}
