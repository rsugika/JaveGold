package Section4;
import java.util.Optional;

public class Check4 {

	public static void main(String[] args) throws Exception {

//		get()で、空の値を扱う問題点は、非検査例外が発生するため例外処理が無視されること
//		意図的に例外を発生させるにはorElseThrow()を用いる
		
		Optional<String> sample = Optional.empty();
		
		System.out.println(
				sample.orElseThrow(() -> new Exception()));
		
	}
}