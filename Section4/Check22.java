package Section4;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Check22 {

	public static void main(String[] args) {		

	}
}

/***
 * collector interface を実現したクラスの定義
 */
class SampleCollector implements Collector<String, StringBuilder, String> {
	@Override
	public Supplier<StringBuilder> supplier() {
		return StringBuilder::new;
	}
	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return (builder, str) -> {
			if(builder.length() != 0) {
				builder.append(",");
			}
			builder.append(str);
		};
	}
	@Override
	public BinaryOperator<StringBuilder> combiner() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Function<StringBuilder, String> finisher() {
		// TODO Auto-generated method stub
		return builder -> builder.toString();
	}
	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return EnumSet.noneOf(Characteristics.class);
	}

}