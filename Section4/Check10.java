package Section4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Check10 {
	public static void main(String[] args) {
		
//		BaseStreamとサブインターフェースにて、参照型を扱うインターフェースとPrimitive型を扱うインターフェースには互換性がない
		
//		配列からストリームを作る
		String[] array = {"A", "B", "C"};
		Stream<String> stream = Arrays.stream(array);
		
//		Primitive型の配列を扱う場合、戻り値はIntStreamやLongStream、DoubleStream型になる
//		したがって、以下はコンパイルエラーとなる
		int[] array_int = {1, 2, 3, 4, 5};
//		Stream<Integer> stream_int = Arrays.stream(array_int);
	}
}