package intermediatary_ops;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Custom_29 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "BB", "CCC", "DDDD");

		list.stream()
			.peek(new PeekConsumer())
			.forEach(new FinalPrint());
	}
}

class PeekConsumer implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Peeking: " + t);
	}
}

class FinalPrint implements Consumer<String> {

	public void accept(String t) {
		System.out.println("Final: " + t);
	}
}
