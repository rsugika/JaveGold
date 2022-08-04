package Section4;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Check16 {

	public static void main(String[] args) {
		
//		findany()とfindFirst()の処理結果の違いは並列処理をおこなったときに現れる
//		findany()はランダムな値が返される
		String[] array = {"A", "B", "C"};
		Stream<String> stream = Arrays.stream(array);
		Optional<String> result = stream.findAny();
		result.ifPresent(System.out::println);
		
		
		
//		findFirst()は、処理の順番にかかわらず、オリジナルの順番が保たれる
		String[] array2 = {"A", "B", "C"};
		Stream<String> stream2 = Arrays.stream(array2);
		Optional<String> result2 = stream2.findFirst();
		result2.ifPresent(System.out::println);
		
	}
}