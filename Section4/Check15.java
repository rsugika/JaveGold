package Section4;
import java.util.Arrays;
import java.util.List;

public class Check15 {

	public static void main(String[] args) {
		
//		ストリームのそのほかのメソッド
//		重複を取り除く
		List<String> list = Arrays.asList("A","B","C","A","B");
		list.stream()
			.distinct()
			.forEach(System.out::println);
		
//		数で絞りこむ
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list2.stream()
			.limit(5)
			.forEach(System.out::println);
		
//		指定された数だけスキップする
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list3.stream()
			.skip(5)
			.forEach(System.out::println);
	}
}