package Section4;
import java.util.Optional;

public class Check8 {

	public static void main(String[] args) {
		
	}
}


/***
 * 
 * 要約説明
 * 	値ではなくOptionalを戻すメソッドをmap()で呼び出す
 *  map()は、処理結果を値として保持した新しいOptionalのインスタンスを生成する
 *  
 *  この場合は、Optionalの中にOptionalへの参照が入れ子で入ることになる
 *  そのためmap()はOptional<Optional<String>>型の値を戻す
 *  そのため、コンパイルエラーとなる
 *  そこで、flatMapメソッドを使う。このメソッドは戻り値を新しいOptionalのインスタンスに入れずに
 *  そのまま戻す
 *
 */
class FlatMapTest {
	public static void main() {
		Optional<String> a = Optional.of("test");
//		Optional<String> b = a.map(str -> test(str));
		Optional<String> b = a.flatMap(str -> test(str));
		System.out.println(b.get());
	}
	
	private static Optional<String> test(String str) {
		return Optional.of(str.toUpperCase());
	}
}