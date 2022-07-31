package Section4;
import java.util.Optional;

public class Check2 {
	
	public static void main(String[] args) {
		
		new GetTest().main();
		new GetEmptyTestEmpty().main();
	
	}

}

// get()の使用例
class GetTest {
	public static void main() {
		Optional<String> sample = Optional.of("Hello");
		System.out.println(sample.get());
	}
}


// get()で空のOptionalから値を取り出すコード
// get()はnullを許容しないためエラーがおきる
class GetTestEmpty {
	public static void main() {
		Optional<String> sample = Optional.empty();
		System.out.println(sample);
	}
}


// isPresent()では、Optionalのインスタンスがnullかどうかを調べる
// あればtrue、なければfalseを返す
class GetEmptyTest {
	public static void main() {
		Optional<String> sample = Optional.empty();
		if (sample.isPresent()) {
			System.out.println(sample);
		}
	}
}


class GetEmptyTestEmpty {
	public static void main() {
		Optional<String> sample = Optional.empty();

		
		if (sample.isEmpty()) {
			System.out.println(sample);
			return;
		}
		
	}
}