package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Custom_35 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);

		list.stream()
			.limit(4)
			.map(new MultiplyByThree())
			.forEach(new PrintVal());
	}
}

class MultiplyByThree implements Function<Integer, Integer> {

	public Integer apply(Integer t) {
		return t * 3;
	}
}

class PrintVal implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Value: " + t);
	}
}
