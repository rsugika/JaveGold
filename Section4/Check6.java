package Section4;
import java.util.Optional;

public class Check6 {

	public static void main(String[] args) {

		//		ifPresent()は、Comsumer型のlambda式を受け取りOptionalが値を持っていれば、引数に渡してlambda式を実行する
		Optional<String> sample = Optional.of("test");
		sample.ifPresent((str) -> System.out.println(str));
		
		
//		ifPresent()は、OPtionalのインスタンスが値を持っていなければ何もしない。
		Optional<String> samplee = Optional.empty();
		sample.ifPresent((str) -> System.out.println(str));
	}
}