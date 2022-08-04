package Section4;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Check12 {

	public static void main(String[] args) {
		
//		ストリームの処理順番
//		Streamの要素をハッシュコードの順で並び替えて1つずつ表示する
		
		Set<String> set = new HashSet<>();
		set.add("E");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("A");
		Stream<String> stream = set.stream();
		stream.forEach(System.out::println);
		
	}
}