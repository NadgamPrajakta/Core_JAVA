package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Custom_36 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12);

		list.stream()
			.skip(2)
			.forEach(new SquareConsumer());
	}
}

class SquareConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Square = " + (t * t));
	}
}
