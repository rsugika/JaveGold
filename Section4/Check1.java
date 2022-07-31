package Section4;
import java.util.Optional;

public class Check1 {
	
	public static void main(String[] args) {
		
//		Optional<String> result = getFromArray(new String[] {"A", "B", null}, 3);
//		if (result.isEmpty()) {
//			System.out.println("empty");
//			return;
//		}
//		System.out.println(result.get());	
		
		new OfTest().main();
	}

	private static <T> Optional<T> getFromArray(T[] array, int index) {
		if (array == null) {
			return Optional.empty();
		}
		try {
			return Optional.ofNullable(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return Optional.empty();
		}
	}

}



class OldTest {
	public static void main() {
		try {
			String result = getFromArray(new String[] {"A", "B", null}, 3);
			
			if (result == null) {
				System.out.println("empty");
				return;
			}
			System.out.println(result);
		} catch (IllegalArgumentException e) {
			System.out.println("exception");
		}
	}
	
	/***
	 * 
	 * 要約説明
	 * 引数の配列は参照型であるため、配列の参照ではなくnullが渡される可能性がある
	 * 引数で渡されるインデックスが、配列の要素数を超えてしまうことがある
	 * 配列の要素がnullである可能性があるため、戻り値を受け取った側でnullの確認をしなければエラーとなる
	 * スローされるIllegalArgumentExceptionは非検査例外であるため、例外処理が無視される可能性がある
	 * 
	 * これらの問題を解決するのがOptionalクラス
	 * 
	 * 詳細説明
	 * @param <T>
	 * @param array
	 * @param index
	 * @return
	 */
	
	private static <T> T getFromArray(T[] array, int index) {
		if (array == null) {
			throw new IllegalArgumentException();
		}
		try {
			return array[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	}
}


class OfTest {
	public static void main() {
		
//		of()は引数にnullを許容しないため実行エラーとなる
//		Optional<String> sample = Optional.of(null);
//		System.out.println(sample);
		
		
//		引数がnullの可能性があるときは、ofNullableを用いる
//		nullが渡されれば、空のOptionalインスタンスを返す
		Optional<String> sample = Optional.ofNullable(null);
		System.out.println(sample);
		
	}
}