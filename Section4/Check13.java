package Section4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Check13 {

	public static void main(String[] args) {
		
//		並列ストリーム（並列処理を行うストリームのこと）
//		複数のスレッドが一斉に起動して処理を行ているため出力は毎回異なる結果となる
		List<String> list = Arrays.asList("A","B","C","D","E");
		Stream<String> stream = list.parallelStream();
//		stream.forEach(System.out::println);
		
//		Stramの順番を保持したい場合は以下のようにおこなう
		stream.forEachOrdered(System.out::println);
		
	}
}