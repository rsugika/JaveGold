package Section4;
import java.util.Optional;

public class Check7 {

	public static void main(String[] args) {
		
		
//		map()は、Function型の引数を受け取り、処理結果を持った新しいOptionalのインスタンスを生成し参照を戻す
		Optional<String> sample = Optional.of("test");
		Optional<String> result = sample.map(
				str -> str.toUpperCase());
		
		System.out.println(sample.get());
		System.out.println(result.get());
		
		
//		map()は処理するOptionalのインスタンスが空だった場合には、新たな空のOptionalのインスタンスを生成する
//		そのため、例外が発生することはない
		
		Optional<String> sample2 = Optional.ofNullable(null);
		Optional<String> result2 = sample.map(
				str -> str.toUpperCase());
	
		
	}
}