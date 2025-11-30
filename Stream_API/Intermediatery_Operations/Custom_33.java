package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Custom_33 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 4, 4, 6, 8, 10, 10, 12);

		nums.stream()
			.distinct()
			.filter(new EvenNumFilter())
			.forEach(new PrintNum());
	}
}

class EvenNumFilter implements Predicate<Integer> {

	public boolean test(Integer t) {
		return t % 2 == 0;
	}
}

class PrintNum implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Distinct Even Number: " + t);
	}
}
