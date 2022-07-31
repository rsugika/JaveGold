package Section4;
import java.util.List;

public class Check9 {

	public static void main(String[] args) {
		
//		拡張for文を使った要素の取り出し
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		for (Integer num : list) {
			System.out.println(num);
		}
		
//		forEach()を使った要素の取り出し
		list.forEach(x -> System.out.println(x));
		
		
//		メソッド参照(lambda式の代わりに)
		list.forEach(System.out::println);
		
	}
}