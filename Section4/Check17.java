package Section4;
import java.util.Arrays;
import java.util.List;

public class Check17 {

	public static void main(String[] args) {
		
//		ストリーム内のメソッドを並べ替える
		
		List<String> list = Arrays.asList("A", "B", "C", "A");
		list.stream()
			.sorted()
			.forEach(System.out::println);
		
		
//		Itemの並び替え
		List<Item> item_list = Arrays.asList(
				new Item("A"),
				new Item("B"),
				new Item("C"));
		
//		Stringクラスが持っているCompareTo()を用いる
		item_list.stream()
				.sorted((a, b) -> a.getName().compareTo(b.getName()))
				.forEach(System.out::println);
		
	}
}


//自然順序で並べ替えができないクラスの例
class Item {
	private String name;
	public Item(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return this.name;
	}
 }