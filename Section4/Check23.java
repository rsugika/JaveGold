package Section4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check23 {

	public static void main(String[] args) {		

		List<Unit4Item> list = Arrays.asList(
			new Unit4Item(1, Unit4ItemType.BOOK, "java", 1980),
			new Unit4Item(2, Unit4ItemType.BOOK, "Lambda", 180),
			new Unit4Item(3, Unit4ItemType.BOOK, "Software", 3980),
			new Unit4Item(4, Unit4ItemType.BOOK, "Test", 1920)
		);

		List<Unit4Item> books = list.stream()
			.filter(item -> 
						item.getType() == Unit4ItemType.BOOK)
			.collect(Collectors.toList());
		books.forEach(System.out::println);

		Set<Unit4Item> books_set = list.stream()
			.filter(item -> 
						item.getType() == Unit4ItemType.BOOK)
			.collect(Collectors.toSet());
		books_set.forEach(System.out::println);

		Map<String, Unit4Item> books_map = list.stream().collect(Collectors.toMap(
			Unit4Item::getName,
			item -> item));
			
		books_map.keySet().stream().forEach(System.out::println);
	}
}


enum Unit4ItemType {
	BOOK, MAGAZINE, DVD
}

class Unit4Item {
	private int id;
	private Unit4ItemType type;
	private String name;
	private int price;

	public Unit4Item(int id, Unit4ItemType type, String name, int price) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public Unit4ItemType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + "]";
	}
}