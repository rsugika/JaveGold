package Section4;

import java.util.Arrays;
import java.util.List;

public class Check21 {

	public static void main(String[] args) {

		/***
		 * このコードは以下のような問題点がある
		 * 
		 * ラムダ式内部から外部のオブジェクトを操作している。ラムダ式内部から扱われるオブジェクトは基本的にfinalとなる
		 * 同じように文字列のストリームからカンマ区切りの文字列を作る処理を行いたくても再利用できない
		 * 
		 * こういうときは、java.util.stream.Collector Interface を利用する
		 */
		
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		StringBuilder builder = new StringBuilder();
		list.stream().forEach(str -> {
			if (builder.length() != 0) {
				builder.append(",");
			}
			builder.append(str);
		});
		System.out.println(builder);
		
	}
}