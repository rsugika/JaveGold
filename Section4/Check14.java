package Section4;
import java.util.Arrays;
import java.util.List;


public class Check14 {

	public static void main(String[] args) {
		
//		中間操作のフィルタ
//		中間操作は、実行した結果のストリームへの参照を戻す。
//		下のコードは、戻り値の参照を使ってさらにメソッドを呼び出すメソッドチェイン使うほうがらく
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream()
			.filter(x -> x % 2 == 0)
			.forEach(System.out::println);
		
//		filter()による絞り込みは複数回行うことが出来る
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list2.stream()
			.filter(x -> x > 5)
			.filter(x -> x % 2 == 0)
			.forEach(System.out::println);
		
	}
}