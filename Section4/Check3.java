package Section4;
import java.util.Optional;

public class Check3 {

	public static void main(String[] args) {

		//		orElse()は、引数に代替値を指定でき、値を持っていない場合は代替値を戻す
		//		これでifが不要になる
		Optional<String> sample = Optional.empty();
		System.out.println(sample.orElse("empty"));

		//		orElseGet()は、引数としてSupplier型のlambda式を受け取り、インスタンスが空だった場合は、引数のlambda式を実行してその結果を戻す
		Optional<String> samplee = Optional.empty();
		System.out.println(sample.orElseGet(() -> "else"));
	}
}