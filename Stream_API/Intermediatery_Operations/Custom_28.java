package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Custom_28 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		nums.stream()
			.map(new CubeFunction())
			.filter(new GreaterThan100Filter())
			.forEach(new PrintValue());
	}
}

class CubeFunction implements Function<Integer, Integer> {

	public Integer apply(Integer t) {
		return t * t * t;
	}
}

class GreaterThan100Filter implements Predicate<Integer> {

	public boolean test(Integer t) {
		return t > 100;
	}
}

class PrintValue implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Cube > 100 : " + t);
	}
}
