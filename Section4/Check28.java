package Section4;

import java.util.Arrays;
import java.util.stream.Stream;

public class Check28 {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(System.out::println);
		// stream.forEach(System.out::println);
	}
}
