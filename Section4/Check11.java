package Section4;
import java.util.List;

public class Check11 {

	public static void main(String[] args) {
		
		
//		従来のコレクションの使用方法
		List<Integer> a = List.of(1, 2, 3, 4, 5);
		for (Integer num : a) {
			System.out.println(num);
		}
		
//		Stream APIを使用したコード
//		このコードでは、List型変数listのStreamメソッドを呼び出しt、リストからストリームをつくる
//		そして。そのストリームに対して処理を実行する
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream()
			.forEach(System.out::println);
	}
}